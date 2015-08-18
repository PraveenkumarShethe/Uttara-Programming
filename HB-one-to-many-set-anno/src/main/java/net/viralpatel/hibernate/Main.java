package net.viralpatel.hibernate;

import java.util.ArrayList;
import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Department12M department = new Department12M();
		department.setDepartmentName("Sales");
		//session.save(department);
		
		Employee12M emp1 = new Employee12M("Nina", "Mayers", "111");
		Employee12M emp2 = new Employee12M("Tony", "Almeida", "222");
		
		emp1.setDepartment(department);
		department.setEmployees(new HashSet<Employee12M>());
		department.getEmployees().add(emp1);
		department.getEmployees().add(emp2);		//session.save(emp1);
		session.save(emp1);

		session.getTransaction().commit();
		session.close();
	}
}
