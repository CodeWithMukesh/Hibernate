package com.mukesh.learn.HibernateProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mukesh.learn.HibernateProject.entities.Student;
import com.mukesh.learn.HibernateProject.entities.User;

public class App {
	public static void main(String[] args) throws IOException {
		System.out.println("Project started...");
		
		//step-1  load hibernate.cfg.xml file	 
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		//step-2
		//Creating Student object
		
		Student student = new Student();
		student.setId(1);
		student.setName("Sonali Mishra");
		student.setCity("Hyderabad");
		student.setEmail("sonali@gmail.com");
		student.setMobile("7368958475");
		System.out.println(student);
		
		// creating User object
		User user = new User();
		user.setUser_name("Mukesh mishra");
		user.setUser_address("Banglore");
		user.setReg_date(new Date()); 
		user.setX(102.232);

		// Saving Image Logic into database		
		// Reading image
		FileInputStream fis = new FileInputStream("src/main/java/image/pic.jpg");
		byte[] data = new byte[fis.available()];
		fis.read(data);
		user.setImage(data);
		
		
//		printing object
		System.out.println(user);
		
		
		//step-3 save() :- save function session class ke pass hota hai isliye session ko use krna padega yaha
		SessionFactory factory = cfg.buildSessionFactory();
		//session open
		Session session = factory.openSession();
		//saving student object data
		session.save(student);
		
		//saving User object data
		session.save(user);
		
		//session start begin
		session.beginTransaction();
		//call save()
		
		//commit()
		session.getTransaction().commit();
		//session.close()
		session.close();
		fis.close();
		factory.close();
		
		/*
		
		Session session = factory.openSession();
		
		//save() function
		session.save(student);
		
		//session Transactionbegin
		Transaction tr = session.beginTransaction();
		
		//tansaction.commit
		tr.commit();
		
		//session close
		session.close();
		
*/		
	}	
}