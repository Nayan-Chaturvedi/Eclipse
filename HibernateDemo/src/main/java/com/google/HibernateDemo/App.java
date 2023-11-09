package com.google.HibernateDemo;

import javax.transaction.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args ) 
    {
       Student1 std=null;
       
		/*
		 * std.setRollNum(11); std.setMarks(40); std.setName("Vijay");
		 */
       
       
       Configuration config=new Configuration().configure().addAnnotatedClass(Student1.class);
       SessionFactory sf =config.buildSessionFactory();
       Session s = sf.openSession();
      // Transaction t= s.beginTransaction();
      std= s.get(Student1.class, 22);
       s.save(std);
       
       try 
       {
		//t.commit();
       } 
       catch (Exception e) 
       {
		// TODO Auto-generated catch block
		System.out.println("Error");
       } 
      System.out.println(std);
    }
}
