package com.google.ComputerScience;

import org.hibernate.Session;

public class Caching_1_Level 
{

	public static void main(String[] args)
	{
//			1-LEVEL CACHING
		
		Mall m1=null;
		Mall m2=null;
	
		Config conf=new Config();
		Session ses=conf.getSession();
		
		m1=ses.get(Mall.class, 101);
		m2=ses.get(Mall.class, 101);

		System.out.println(m1);
		System.out.println(m2);
		
		ses.close();
		
		
		
	}

}
