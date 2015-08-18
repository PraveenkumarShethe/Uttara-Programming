package com.manju.spring.bean;

public class PersonFactory {

	// make constructor private
	private PersonFactory() {
		;
	}

	/**
	 * static factory method to create PersonFactory object.
	 * 
	 * @return PersonFactory
	 */
	public static PersonFactory getInstance() {
		return new PersonFactory();
	}

	/**
	 * Factory method to create Person object with name "John"
	 * 
	 * @return Person
	 */
	public Person getJohn() {
		Person person = new Person();
		person.setFirstName("John");
		return person;
	}

	/**
	 * Factory method to create Person object with name "Joy"
	 * 
	 * @return Person
	 */
	public Person getJoy() {
		Person person = new Person();
		person.setFirstName("Joy");
		return person;
	}
	
	public Person getPerson(String name,String nn){
		System.out.println(name+"  index "+nn);
	    Person person = new Person();
	    person.setFirstName(name);
	    return person;
	}
}