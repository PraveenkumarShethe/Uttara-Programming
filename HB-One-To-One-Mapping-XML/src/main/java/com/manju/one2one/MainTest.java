package com.manju.one2one;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class MainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
 
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
 
        EmployeeDetail121 employeeDetail = new EmployeeDetail121("10th Street", "LA", "San Francisco", "U.S.");
         
        Employee121 employee = new Employee121("Nina", "Mayers", new Date(121212),
                "114-857-965");
        employee.setEmployeeDetail121(employeeDetail);
        employeeDetail.setEmployee121(employee);
         
        List<Employee121> employees = session.createQuery("from Employee121").list();
        for (Employee121 employee1 : employees) {
            System.out.println("Manju ********************* "+employee1.getFirstName() + " , "
                    + employee1.getLastName() + ", "
                    + employee1.getEmployeeDetail121().getState());
        }
       
        session.save(employee);
        
         
       
 
        session.getTransaction().commit();
        session.close();
        /*for (Employee121 employee1 : employees) {
            System.out.println("Manjudd ********************* "+employee1.getFirstName() + " , "
                    + employee1.getLastName() + ", "
                    + employee1.getEmployeeDetail121().getState());
        }*/
   }

}
