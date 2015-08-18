package net.viralpatel.hibernate;
 
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 
public class Main {
 
    public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
        Department12M department = new Department12M();
        department.setDepartmentName("Sales");
       // session.save(department);
 
        Employee12M emp1 = new Employee12M("Nina", "Mayers", "1212");
        Employee12M emp2 = new Employee12M("Tony", "Almeida", "4343");
 
        emp1.setDepartment(department);
        emp2.setDepartment(department);
 
        session.save(emp1);
        session.save(emp2);
        System.out.println("manju***************");
        Department12M d=(Department12M) session.load(Department12M.class, 1L);
        System.out.println("Manju **********************e");
        Set<Employee12M> emSet=d.getEmployees();
        for(Employee12M e:emSet)
        {
       	 System.out.println(e.getFirstname());
        }
 
        session.getTransaction().commit();
        
       
        
        session.close();
    }
}