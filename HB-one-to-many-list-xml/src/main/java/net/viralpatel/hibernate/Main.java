package net.viralpatel.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sun.net.ssl.internal.ssl.Debug;

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
		
		
		/*emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);*/
		
		department.setEmployees(new ArrayList<Employee12M>());
		department.getEmployees().add(emp1);
		department.getEmployees().add(emp2);
		
	//	session.save(department);
		
		department=(Department12M) session.get(Department12M.class, 1l);
		//department.getEmployees(); // this wont call second select if lazy=true
		List<Employee12M> ss=department.getEmployees();// this also wont call second select if lazy=true
		for(Employee12M d:ss) // this will call second select statement bcs we are try to get actual entity from in database
		{
			
		}
		
		
		List<Department12M> list = session.createQuery("from Department12M").list();

		for(Department12M dd:list)
		{
		List<Employee12M>  ee=dd.getEmployees();
		for(Employee12M d:ee)
		{
			
		}
	//	System.err.println(ee.get(0).getCellphone());
		}

		session.getTransaction().commit();
		session.close();
	}
}
