package com.mukesh.lazy_eager_loading;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		/*
		 * Candidate cand = new Candidate(); cand.setC_id(100);
		 * cand.setC_name("Mukesh"); cand.setC_address("Banaras");
		 * 
		 * Course cour1 = new Course(); cour1.setId(21); cour1.setName("BE-CSE");
		 * 
		 * Course cour2 = new Course(); cour2.setId(22); cour2.setName("BE-CIVIL");
		 * 
		 * Course cour3 = new Course(); cour3.setId(23); cour3.setName("BE-mech");
		 * 
		 * List<Course> course_list = new ArrayList<Course>(); course_list.add(cour1);
		 * course_list.add(cour2); course_list.add(cour3);
		 * 
		 * 
		 * cand.setCourse(course_list);
		 * 
		 * session.save(cand); session.save(cour1); session.save(cour2);
		 * session.save(cour3);
		 * 
		 */

		// fetching data here
		// this is lazy loading example because here is only data initializing only how
		// much required thats it
		// you can see here there is not any data initialized data for course.
		/*
		 * Candidate c = session.get(Candidate.class, 100);
		 * 
		 * System.out.println("Candidate id: "+c.getC_id()+" \n Candidate name: "+c.
		 * getC_name()+" \nCandidate address: "+c.getC_address());
		 * 
		 * List<Course> course = c.getCourse(); for (Course c1 : course) {
		 * System.out.println(c1); }
		 */

		// EAGER LOADING

		Candidate c = session.get(Candidate.class, 100);

		System.out.println("Candidate id: " + c.getC_id() + " \n Candidate name: " + c.getC_name()
				+ " \nCandidate address: " + c.getC_address());

		List<Course> course = c.getCourse();
		for (Course c1 : course) {
			System.out.println(c1);
		}

		session.getTransaction().commit();

		session.close();
		factory.close();
		System.out.println("DONE.....");

	}
}
