package com.manju.one2one;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE121")
public class Employee121 {
	@Id
	@GeneratedValue
	@Column(name = "employee_id")
	private Long employeeId;
	@Column(name = "firstname")
	private String firstName;
	@Column(name = "lastname")
	private String lastName;
	@Column(name = "birth_date")
	private Date birthDate;
	@Column(name = "cell_phone")
	private String cellphone;

	/**
	 * The mappedBy element defines a bidirectional relationship. In a
	 * bidirectional relationship, the side that stores the data (the Employee
	 * class in our example) is the owner. Only changes to the owner side affect
	 * the database, since the other side is not stored and calculated by a
	 * query
	 */

	@OneToOne(mappedBy = "employee121", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
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
