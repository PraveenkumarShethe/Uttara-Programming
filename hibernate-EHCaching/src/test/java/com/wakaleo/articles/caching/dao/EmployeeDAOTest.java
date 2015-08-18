////////////////////////////////////////////////////////////////////////////////
// CountryDAOTest: $Source$
// TODO Class summary goes here
//
// Created : 26 oct. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.wakaleo.articles.caching.dao;

import java.util.List;

import org.hibernate.Transaction;

import com.wakaleo.articles.TestTimer;
import com.wakaleo.articles.caching.businessobjects.Country;

import junit.framework.TestCase;

public class EmployeeDAOTest extends TestCase {

	CountryDAO countryDao = new CountryDAO();
	EmployeeDAO employeeDao = new EmployeeDAO();

	/**
	 * Ensure that the Hibernate session is availiable
	 * to avoid the Hibernate initialisation interfering with
	 * the benchmarks
	 */
	protected void setUp() throws Exception {		
		super.setUp();
		SessionManager.getSession();
	}

	public void testGetNZEmployees() {
		TestTimer timer = new TestTimer("testGetNZEmployees");
		Transaction tx = SessionManager.getSession().beginTransaction();
		Country nz = countryDao.findCountryByCode("nz");
		List kiwis = employeeDao.getEmployeesByCountry(nz);
		tx.commit();
		SessionManager.closeSession();
		timer.done();
	}

	public void testGetAUEmployees() {
		TestTimer timer = new TestTimer("testGetAUEmployees");
		Transaction tx = SessionManager.getSession().beginTransaction();
		Country au = countryDao.findCountryByCode("au");
		List aussis = employeeDao.getEmployeesByCountry(au);	
		tx.commit();
		SessionManager.closeSession();
		timer.done();
	}

	public void testRepeatedGetEmployees() {
		testGetNZEmployees();
		testGetAUEmployees();
		testGetNZEmployees();
		testGetAUEmployees();
	}
}
