package net.viralpatel.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		
		Person person = new Person("Manju", "SSE");
		session.save(person);

		Employee employee = new Employee("Manju", "SE", "Marketing", new Date());
		session.save(employee);
		
		session.getTransaction().commit();
		session.close();

	}
}