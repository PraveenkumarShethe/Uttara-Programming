package com.manju.one2one;

import java.util.Date;

public class Employee121 {
	private Long employeeId;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String cellphone;
	private EmployeeDetail121 employeeDetail121;

	public Employee121() {
	}

	public Employee121(String firstname, String lastname, Date birthdate,
			String phone) {
		this.firstName = firstname;
		this.lastName = lastname;
		this.birthDate = birthdate;
		this.cellphone = phone;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public EmployeeDetail121 getEmployeeDetail121() {
		return employeeDetail121;
	}

	public void setEmployeeDetail121(EmployeeDetail121 employeeDetail121) {
		this.employeeDetail121 = employeeDetail121;
	}

}
