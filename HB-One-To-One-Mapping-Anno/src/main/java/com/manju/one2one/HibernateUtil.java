package com.manju.one2one;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory = buildSessionFactory();  
	private static SessionFactory buildSessionFactory() {   
		try { 
			 return new AnnotationConfiguration().configure().buildSessionFactory();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
		}
	public static SessionFactory getSessionFactory() {   
		return sessionFactory;    }
}
																																									// return
																																									// new
																																									// Configuration()
																																									// .configure()
																																									// .buildSessionFactory();
																																									// }
																																									// catch
	