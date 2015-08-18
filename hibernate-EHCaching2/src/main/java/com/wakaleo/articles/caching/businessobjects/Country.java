////////////////////////////////////////////////////////////////////////////////
// Country: $Source$
// TODO Class summary goes here
//
// Created : 26 oct. 2005 by jfsmart
// Last modified $Date$ by $Author$
// Revision: $Revision$
// Version : $ID$
// Copyright (c) 2005
////////////////////////////////////////////////////////////////////////////////

package com.wakaleo.articles.caching.businessobjects;

import java.util.Set;

public class Country {

	private Long id;
	private String code;
	private String name;
	private Set airports;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Airport> getAirports() {
		return airports;
	}
	public void setAirports(Set<Airport> airports) {
		this.airports = airports;
	}
	
	
}
