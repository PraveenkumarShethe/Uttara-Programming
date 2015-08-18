package net.viralpatel.hibernate;

import java.util.Set;

public class Department12M {

	private Long departmentId;
	
	private String departmentName;
	
	private Set<Employee12M> employees;

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Set<Employee12M> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<Employee12M> employees) {
		this.employees = employees;
	}

}
