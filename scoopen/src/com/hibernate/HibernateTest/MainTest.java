package com.hibernate.HibernateTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTest {
	public static void main(String[] args) {
		
		SessionFactory sfactory = new Configuration().configure().buildSessionFactory();
		Session session = sfactory.openSession();
		Transaction tr =   session.beginTransaction();
		session.save(new Stud(1,"abhijeet", 60000));
		session.save(new Stud(2,"Bhalerao", 600));
		
		session.flush();
		tr.commit();
		System.out.println("table ok");
	}

		
		
	

}
