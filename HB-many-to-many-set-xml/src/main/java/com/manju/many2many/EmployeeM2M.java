package com.manju.many2many;

import java.util.HashSet;
import java.util.Set;

public class EmployeeM2M {

	
	public EmployeeM2M()
	{
		
	}
	private Long employeeId;
	private String firstname;
	private String lastname;
	/*
	@ManyToMany(cascade = {CascadeType.ALL})    
	@JoinTable(name="EMPLOYEE_MEETING",      
			joinColumns={@JoinColumn(name="EMPLOYEE_ID")}, 
			inverseJoinColumns={@JoinColumn(name="MEETING_ID")}) */
	Set<MeetingM2M> meetings=new HashSet<MeetingM2M>();

	public EmployeeM2M(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;
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

	public Set<MeetingM2M> getMeetings() {
		return meetings;
	}

	public void setMeetings(Set<MeetingM2M> meetings) {
		this.meetings = meetings;
	}

}
