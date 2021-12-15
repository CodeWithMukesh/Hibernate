package com.mukesh.mapping;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		//LOADING HIBERNATE.CFG.XML CONFIGURATION FILE......[ STEP-1 ]
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		/*
		 * //CREATING QUESTION OBJECT Question q = new Question(); q.setQuesid(101);
		 * q.setQuestion("What is java developer needs?");
		 * 
		 * //ANSWER -FIRST Answer ans1 = new Answer(); ans1.setAnsid(201);
		 * ans1.setAnswer("Core java concept"); ans1.setQuestion(q);
		 * 
		 * 
		 * //ANSWER SECOND Answer ans2 = new Answer(); ans2.setAnsid(7843);
		 * ans2.setAnswer("Advance java"); ans2.setQuestion(q);
		 * 
		 * //ANSWER THIRD Answer ans3 = new Answer(); ans3.setAnsid(7401);
		 * ans3.setAnswer("hibernate spring boot"); ans3.setQuestion(q);
		 * 
		 * //STORING ALL ANSWERS IN A LIST List<Answer> answers = new
		 * ArrayList<Answer>(); answers.add(ans1); answers.add(ans2); answers.add(ans3);
		 * 
		 * q.setAnswer(answers);
		 */
		
		
		//DATABASE ME KUCH BHI OPERATION PERFORM KRNE KE LIYE SESSION CREATE KRNA PDTA HAI
		SessionFactory factory = cfg.buildSessionFactory();
		Session s = factory.openSession();
		//s.beginTransaction();
//		s.save(q);
//		s.save(ans1);
//		s.save(ans2);
//		s.save(ans3);
		
		//s.getTransaction().commit();
		
		                     
		s.close();
		factory.close();
	}
}