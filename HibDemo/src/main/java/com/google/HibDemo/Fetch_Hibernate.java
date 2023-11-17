package com.google.HibDemo;

import org.hibernate.Session;

public class Fetch_Hibernate {

	public static void main(String[] args)
	{
		Mall m=null;
		
		Config conf=new Config();
		Session s=conf.getSession();
		m=s.get(Mall.class, 107);
		System.out.println(m);
		s.close();

	}

}
