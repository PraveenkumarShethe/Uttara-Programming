package com.manju.spring.services;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

public class CustomerService2 implements ResourceLoader
{
	private ResourceLoader resourceLoader;
	
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.resourceLoader = resourceLoader;
	}
		
	public Resource getResource(String location){
		return resourceLoader.getResource(location);
	}

	@Override
	public ClassLoader getClassLoader() {
		// TODO Auto-generated method stub
		return null;
	}
}
