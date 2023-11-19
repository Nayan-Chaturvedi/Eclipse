package com.google.HibDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Update_Hibernate {

	public static void main(String[] args) 
	{
		Mall m=null;
		Config conf=new Config();
		Session ses=conf.getSession();
		Transaction tx=ses.getTransaction();		// get transaction without begain
		// FETCH DATA
		
		m=ses.get(Mall.class, 105);
		
		if(m!=null)
		{
			m.setShopName("Allen_Solly");
			tx.begin();
			ses.save(m);
			tx.commit();
			System.out.println(m);
		}
		else
		{
			System.out.println("Coloumn doe's not present");
		}
		
		

	}

}
