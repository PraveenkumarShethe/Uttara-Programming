package net.viralpatel.hibernate;

import java.util.List;


public class Department12M {

	private Long departmentId;
	
	private String departmentName;
	
	private List<Employee12M> employees;

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

	public List<Employee12M> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee12M> employees) {
		this.employees = employees;
	}
}
