package com.core;

import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class SelectData_Employee_DAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Query q = s.createQuery("from Employee");// it is used for HQL related
		List<Employee> list = q.list();
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			Employee e = (Employee)iterator.next();
			System.out.println("ID: "+e.getId());
			System.out.println("Fname: "+e.fname);
			System.out.println("Lname: "+e.lname);
			s.save(t);
			t.commit();
			sf.close();
		}
		
	}

}
