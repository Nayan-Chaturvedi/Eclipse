package com.google.ComputerScience;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertData_Hibernate {

	public static void main(String[] args)
	{
		Mall m=new Mall();
		m.setShopNum(103);
		m.setShopName("Allen_Solly");
		
		Config conf=new Config();
		Session ses=conf.getSession();
		Transaction tx=ses.beginTransaction();
		ses.save(m);
		tx.commit();
		System.out.println(m);

	}

}
