package com.google.HibDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Delete_Hibernate 
{
	public static void main(String[] args)
	{
		Mall m=null;
		
		Config conf=new Config();
		Session ses=conf.getSession();
		Transaction tx=ses.getTransaction();		//	get transaction without begain
		
		//		FETCH DATA
		
		m=ses.get(Mall.class, 109);
		System.out.println(m);
		
		if(m!=null)
		{
			tx.begin();
			ses.delete(m);
			tx.commit();
			
		}
		else
		{
			System.out.println("Coloumn doe's not present");
		}
	}
}
