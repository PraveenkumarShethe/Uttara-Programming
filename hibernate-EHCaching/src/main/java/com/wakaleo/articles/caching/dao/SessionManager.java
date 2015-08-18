////////////////////////////////////////////////////////////////////////////////
// SessionManager.java : $Source: /r/fox/commons/fox/src/java/aacom/commons/fox/persistance/hibernate/SessionManager.java,v $
// Hibernate session management.
//
// Created : 2 oct. 03 by jfsmart
// Last modified $Date: 2005/06/02 12:53:53 $ by $Author: jfsmart $
// Revision: $Revision: 1.12 $
// Version : $ID$
// Copyright (c) 2003
////////////////////////////////////////////////////////////////////////////////

package com.wakaleo.articles.caching.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Hibernate session management.
 * Sets up a session factory and provides functions to provide
 * Hibernate sessions to client classes.
 * This class works using a singleton pattern : references to
 * the unique instance of this class are fetched using the
 * <code>getInstance()</code> method.
 * The hibernate configuration is set up using the XML hibernate configuration
 * file. The configuration file is expected to be in the root of your CLASSPATH.
 * By default, it is called 'hibernate.cfg.xml', but its name may also be
 * specified in the parameters.properties (or 'local-parameters.properites') file,
 * using the 'hibernate.configuration.file' property, ex :
 * <pre>
 *   hibernate.configuration.file = hibernate-test.cfg.xml
 * </pre>
 * 
 * The session is automatically initialized when necessary by the
 * getConnection() method in the HibernateConnectionFactory class.
 *
 * @author jfsmart
 *
 * Copyright (c) 2003
 * @version $Id: SessionManager.java,v 1.12 2005/06/02 12:53:53 jfsmart Exp $
 */
public final class SessionManager {
 
    /**
     * Parameter used to define the XML Hibernate configuration file
     */
    private static final String HIBERNATE_CONFIGURATION_FILE_PROPERTY 
        = "hibernate.configuration.file";
    
    /**
     * Class logger
     */
    private static Log log = LogFactory.getLog(SessionManager.class);

    /**
     * The one and only session manager instance
     */
    private static SessionManager sessionManager = new SessionManager();
    /**
     * The one and only Hibernate session factory.
     */
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (HibernateException ex) {
            throw new RuntimeException("Configuration problem: " + ex.getMessage(), ex);
        }
    }
    
    /** 
     * The thread-local Hibernate session object
     */
    private static final ThreadLocal threadSession = new ThreadLocal();
    
    public static Session getSession() throws HibernateException {
    	return currentSession();
    }
    
    public static Session currentSession() throws HibernateException {
    	log.debug("Hibernate Session Manager :Fetching a hibernate session");
        Session s = (Session) threadSession.get();
        // Open a new Session, if this Thread has none yet
        if (s == null) {
            s = sessionFactory.openSession();
            threadSession.set(s);
        } 
        if (!s.isOpen()) {
            s = null;
            s = sessionFactory.openSession();
            threadSession.set(s);
        }
        
        if (!s.isConnected()){
        	s.reconnect();
        }
    	log.debug("Hibernate Session Manager :Fetching a hibernate session done.");
        return s;
    }

    /**
     * Close the current Hibernate session
     * @throws HibernateException
     * @throws InfrastructureException
     */
    public static void closeSession() throws HibernateException {
        log.debug("Hibernate Session Manager : closeSession");
        Session s = (Session) threadSession.get();
        threadSession.set(null);
        if (s != null && s.isOpen()) {
            log.debug("Hibernate Session Manager : closing session");
            s.close();
            log.debug("Hibernate Session Manager : session closed");
        }
        s = null;
    }
    
    /**
     * Connect this session to the current thread
     * @param session
     * @throws HibernateException
     */
    public static void reconnect(Session session) throws HibernateException {
            if (!session.isConnected()) {
            	session.reconnect();
            }
            threadSession.set(session);
    }
    
    /**
     * Disconnect the current session from the current thread
     * @return
     * @throws HibernateException
     * @throws HibernateException
     */
    public static Session disconnectSession() throws HibernateException {
        Session session = currentSession();
    	if (session.isConnected() && session.isOpen()) {
			session.disconnect();
        }
        return session;
    }

    /**
     * Default constructor
     */
    private SessionManager() {
        super();
    }

    /**
     * Returns an instance of a session mananger used to obtain
     * a Hibernate Session object.
     * @return the Hibernate session manager.
     */
    public static SessionManager getInstance() {
        return sessionManager;
    }

    public static Session openSession() throws HibernateException {
        return SessionManager.currentSession();
    }


}
