package com.Single;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert_Data_Single_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con  = new Configuration();
		con.configure("Hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction ts = session.beginTransaction();
		
		Employee e1 = new Employee();
		e1.setName("Yash");
		
		RegularEmployee re = new RegularEmployee();
		re.setName("Rohit");
		re.setBonus(5500);
		re.setSalary(50000);
		ContractEmployee ce = new ContractEmployee();
		ce.setName("Pappu");
		ce.setRate_per_hr(1000);
		ce.setNo_periods(30);
		
		session.save(e1);
		session.save(ce);
		session.save(re);
		
		ts.commit();
		session.close();
		sf.close();
	}

}
