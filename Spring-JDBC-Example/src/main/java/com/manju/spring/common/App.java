package com.manju.spring.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.manju.spring.customer.dao.CustomerDAO;
import com.manju.spring.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(1, "manju",28);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(1);
        System.out.println(customer1);
        
    }
}
