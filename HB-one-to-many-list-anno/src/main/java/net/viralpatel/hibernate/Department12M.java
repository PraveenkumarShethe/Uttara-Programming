package net.viralpatel.hibernate;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name="DEPARTMENT12M")
public class Department12M {

	@Id
	@GeneratedValue
	@Column(name="DEPARTMENT_ID")
	private Long departmentId;
	
	@Column(name="DEPT_NAME")
	private String departmentName;
	/**
	 * Note that in Department entity class, '
	 * we removed mappedBy clause from @OneToMany. 
	 * This mark Department as the relationship owner and make it responsible to update foriegn keys and index values.
	 * also we specified index coulmn using @IndexColumn annotation to specify which column in Employee table we would like to store index in.
	 */
	
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="department_id")
	@IndexColumn(name="idx")
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
