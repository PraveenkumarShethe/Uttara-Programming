package net.viralpatel.hibernate;

import java.sql.Date;

public class Employee12M {

	private Long employeeId;

	private String firstname;

	private String lastname;

	private Date birthDate;

	private String cellphone;

	private Department12M department;

	public Employee12M() {
	}

	public Employee12M(String firstname, String lastname, Date birthdate,
			String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthdate;
		this.cellphone = phone;
	}

	public Employee12M(String firstname, String lastname, String phone) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.cellphone = phone;
	}
	
	@Override
	public boolean equals(Object emp) {
		if(emp instanceof Employee12M) {
			Employee12M employee = (Employee12M)emp;
			
			if(this.firstname.equals(employee.getFirstname()) &&
					this.lastname.equals(employee.getLastname()))
				return true;
		}

		return false;
	}
	@Override
	public int hashCode() {
	
		return this.firstname.hashCode() + this.lastname.hashCode();
	}
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public Department12M getDepartment() {
		return department;
	}

	public void setDepartment(Department12M department) {
		this.department = department;
	}
	
}
