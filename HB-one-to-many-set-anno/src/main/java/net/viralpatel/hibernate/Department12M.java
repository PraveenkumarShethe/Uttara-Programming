package net.viralpatel.hibernate;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	 * The association may be bidirectional. In a bidirectional relationship, 
	 * one of the sides (and only one) has to be the owner: 
	 * the owner is responsible for the association column(s) update. To declare a side as not responsible for the relationship, 
	 * the attribute mappedBy is used. mappedBy refers to the property name of the association on the owner side. In our case,
	 * this is employee. As you can see, you don’t have to (must not) declare the join column since it has already been declared on the owners side.
	 */
	
	@OneToMany(mappedBy="department",cascade=CascadeType.ALL)
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
