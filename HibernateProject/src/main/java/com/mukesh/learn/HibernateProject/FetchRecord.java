package com.mukesh.learn.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mukesh.learn.HibernateProject.entities.Student;
import com.mukesh.learn.HibernateProject.entities.User;

public class FetchRecord {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory =cfg.buildSessionFactory();
	Session session = factory.openSession();
	//transaction use nahi krna pdega bcz we are fetching record not inserting records
	
	
	//fetching record by get() method and load() method
	//Student std =(Student)session.get(Student.class, 1);
	Student std =(Student)session.get(Student.class, 35);
	
//	User user = (User)session.get(User.class, 1);
//	System.out.println(user.getUser_name());
	
	System.out.println(std);
	
	session.close();
	factory.close();
	
}
}
