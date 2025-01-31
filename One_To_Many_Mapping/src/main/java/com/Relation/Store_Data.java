package com.Relation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Store_Data {

    public static void main(String[] args) {
        
        Configuration con = new Configuration();
        con.configure("hibernate.cfg.xml");
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction ts = session.beginTransaction();

       
        Question q = new Question();  
        q.setQname("What is Hibernate?");

        Answer a1 = new Answer();
        a1.setPostedBy("Akshay");
        a1.setAnswername("Hibernate is an ORM framework.");  

        
        List<Answer> answerList = new ArrayList<>();
        answerList.add(a1);
        q.setAnswers(answerList);

        session.save(q);
        ts.commit();
        session.close();
        sf.close();

        System.out.println("Data has been successfully added to the tables!");
    }
}