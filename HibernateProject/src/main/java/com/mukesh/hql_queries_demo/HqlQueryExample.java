package com.mukesh.hql_queries_demo;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mukesh.learn.HibernateProject.entities.Student;

import jakarta.persistence.Query;

public class HqlQueryExample {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// String query ="from Student";
		// String query = "from Student where city ='pune'";
		String query = "from Student where city= :c";

		Query q = session.createQuery(query);
		q.setParameter("c", "pune");
		List<Student> list = q.getResultList();
		for (Student row : list) {
			System.out.println(row);

		}

		/*
		 * System.out.println("__________________________________________________");
		 * 
		 * //DELETE ROWS:- session.beginTransaction();
		 * 
		 * String deleteQuery ="delete from Student where id =101"; Query q1 =
		 * session.createQuery(deleteQuery); int result = q1.executeUpdate();
		 * System.out.println("deleted:" + result); session.getTransaction().commit();
		 * session.close();
		 */
		
		System.out.println("_____________________________________________________");
			//UPDATE ROWS

		session.beginTransaction();	
		Query q3 =	session.createQuery("update Student set name = :n where id = :i");
		q3.setParameter("n", "harikrishna");
		q3.setParameter("i", 102);

		q3.executeUpdate();
	session.getTransaction().commit();
	session.close();
	factory.close();
		
		
		
	}

}