package com.manju.many2many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		MeetingM2M meeting1 = new MeetingM2M("Quaterly Sales meeting");
		MeetingM2M meeting2 = new MeetingM2M("Weekly Status meeting");
		EmployeeM2M employee1 = new EmployeeM2M("Sergey", "Brin");
		EmployeeM2M employee2 = new EmployeeM2M("Larry", "Page");
		employee1.getMeetings().add(meeting1);
		employee1.getMeetings().add(meeting2);
		employee2.getMeetings().add(meeting1);
		session.save(employee1);
		session.save(employee2);
		session.getTransaction().commit();
		session.close();
		session = sessionFactory.openSession();
		session.beginTransaction();
		EmployeeM2M em = (EmployeeM2M) session.get(EmployeeM2M.class, 1l);

		System.out.println(em.getMeetings().size());

		MeetingM2M m2m = (MeetingM2M) session.get(MeetingM2M.class, 1l);

		System.out.println(m2m.getEmployees().size());

		session.getTransaction().commit();
		session.close();

	}

}
