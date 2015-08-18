package com.manju.many2many;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MeetingM2M {
	private Long meetingId;
	private String subject;
	private Date meetingDate;
	  //@ManyToMany(mappedBy="meetings")
	private Set<EmployeeM2M> employees = new HashSet<EmployeeM2M>();

	
	public MeetingM2M()
	{
		
	}
	
	public MeetingM2M(String subject) {
		this.subject = subject;
		this.meetingDate = new Date();
	}

	public Long getMeetingId() {
		return meetingId;
	}

	public void setMeetingId(Long meetingId) {
		this.meetingId = meetingId;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Date getMeetingDate() {
		return meetingDate;
	}

	public void setMeetingDate(Date meetingDate) {
		this.meetingDate = meetingDate;
	}

	public Set<EmployeeM2M> getEmployees() {
		return employees;
	}

	public void setEmployees(Set<EmployeeM2M> employees) {
		this.employees = employees;
	}
}
