package com.manju.spring.customer.dao;

import com.manju.spring.customer.model.Customer;

public interface CustomerDAO 
{
	public void insert(Customer customer);
	public Customer findByCustomerId(int custId);
}




