package com.mukesh.map.many2many;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapTest {
public static void main(String[] args) {
	Configuration config = new Configuration();
	config.configure("hibernate.cfg.xml");
	
	SessionFactory factory = config.buildSessionFactory();
	Session s = factory.openSession();
	s.beginTransaction();
	
	Employee emp1 = new Employee();
	Employee emp2 = new Employee();
	
	emp1.setId(100);
	emp1.setName("Mukesh");
	emp1.setPost("junior Developer");
	
	emp2.setId(200);
	emp2.setName("Ritu");
	emp2.setPost("junior Developer");
	
	Project proj1 =new Project();
	Project proj2 =new Project();
	
	proj1.setPid(11);
	proj1.setPname("Chatbot development");
	
	proj2.setPid(12);
	proj2.setPname("SBI Module development");
	
	List<Employee> l1 = new ArrayList<Employee>();
	List<Project> l2= new ArrayList<Project>();
	
	l1.add(emp1);
	l1.add(emp2);
	
	l2.add(proj2);
	l2.add(proj1);
	
	emp1.setProject(l2);
	proj2.setEmployee(l1);
	
	
	
	
	
	
	s.save(emp1);
	s.save(emp2);
	s.save(proj1);
	s.save(proj2);
	
	s.getTransaction().commit();
	s.close();
	factory.close();
	
	System.out.println("successful mapping ....Done!");
}

}
