package com.manju.spring.beanwrapper;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;

public class BWTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BeanWrapper company = new BeanWrapperImpl(new Company().getClass());
		// setting the company name..
		company.setPropertyValue("name", "Some Company Inc.");
		// ... can also be done like this:
		PropertyValue value = new PropertyValue("name", "Some Company Inc.");
		company.setPropertyValue(value);

		// ok, let's create the director and tie it to the company:
		BeanWrapper jim = new BeanWrapperImpl(new Employee().getClass());
		jim.setPropertyValue("salary",2.000);
		jim.setPropertyValue("name", "Jim Stravinsky");
		company.setPropertyValue("managingDirector", jim.getWrappedInstance());

		// retrieving the salary of the managingDirector through the company
		Float salary = (Float) company.getPropertyValue("managingDirector.salary");
		System.out.println(salary);
        System.out.println(company.getPropertyValue("name"));
        
	}

}
