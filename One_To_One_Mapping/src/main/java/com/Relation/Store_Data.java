package com.Relation;

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
		
		Employee e1 = new Employee();
		e1.setName("Yash");
		Address a1 = new Address();
		a1.setCity("Ahmednagar");
		a1.setLaneno("402");
		a1.setState("Uttar Pradesh");
		a1.setPincode(271313);
		e1.setAddress(a1);
		a1.setEmployee(e1);
		session.save(e1);
		session.save(a1);
		ts.commit();
		session.close();
		sf.close();
		
		
		
	}

}
