////////////////////////////////////////////////////////////////////////////////
// CountryDAO: $Source$
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

import com.wakaleo.articles.caching.businessobjects.Country;

public class CountryDAO {

	public Country findCountryByCode(String code) {
		return (Country) SessionManager.currentSession()
							 .createQuery("from Country as c where c.code = :code")
							  .setParameter("code",code)
							  .uniqueResult();
	}
	
	public List getCountries() {
		return SessionManager.currentSession()
							 .createQuery(
							  "from Country as c order by c.name")
							  .setCacheable(true)
							  .list();
	}
}
