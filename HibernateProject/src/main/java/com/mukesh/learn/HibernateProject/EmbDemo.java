package com.mukesh.learn.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mukesh.learn.HibernateProject.entities.Certificate;
import com.mukesh.learn.HibernateProject.entities.Student;

public class EmbDemo {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory = cfg.buildSessionFactory();
	
	Student s = new Student();

	s.setCity("Banglore");
	s.setEmail("mkmishra@gmail.com");
	s.setName("mukky");
	s.setMobile("6666777788");
	
	Certificate cert = new Certificate();
	cert.setCourse("Java");
	cert.setDuration("6 month");
	
	s.setCert(cert);
	
// object - second	
	Student s1 = new Student();

	s1.setCity("hyderabad");
	s1.setEmail("soonu@gmail.com");
	s1.setName("soonu");
	s1.setMobile("8966777788");
	
	Certificate c = new Certificate();
	c.setCourse("machine learning");
	c.setDuration("6 month");
	
	s1.setCert(c);  
	
	Session session = factory.openSession();
	// fetch record
	
	session.save(s);
	session.save(s1);
	session.beginTransaction();
	session.getTransaction().commit();
	
	Student std = session.get(Student.class, 2);
	
	System.out.println(std+"  "+std.getCert().getCourse()+"  "+std.getCert().getDuration());
	session.close();
	factory.close();
}
}
