package com.Many;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store_Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con  = new Configuration();
		con.configure("Hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		Answer an1 = new Answer();
		an1.setAnswername("Java is a programming language");
		an1.setPostedBy("Ravi Malik");
		
		Answer an2 = new Answer();
		an2.setAnswername("Java is platform independent");
		an2.setPostedBy("Sudhir Kumar");
		
		Question q1 = new Question();
		q1.setQname("What is Java?");
		ArrayList<Answer>l1 =  new ArrayList<Answer>();
		l1.add(an1);
		l1.add(an2);
		q1.setAnswers(l1);
		
		Answer ans3 = new Answer();
		ans3.setAnswername("Servelet is an Interface");
		ans3.setPostedBy("Arun");
		
		Answer ans4 = new Answer();
		ans4.setAnswername("Servelet is an API");
		ans4.setPostedBy("Jai Kumar");
		
		Question q2 = new Question();
		q2.setQname("What is Servelet?");
		ArrayList<Answer>l2 = new ArrayList<>();
		l2.add(ans3);
		l2.add(ans4);
		q2.setAnswers(l2);
		
		session.persist(q1);
		session.persist(q2);
		ts.commit();
		session.close();
		sf.close();
	}

}
