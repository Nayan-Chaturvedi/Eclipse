package com.google.HibDemo;

import org.hibernate.Session;

public class Caching_Level_2 {

	public static void main(String[] args)
	{
//		Some Issue in this code
//		This code have some issue
		
		
		Mall m1=null;
		Mall m2=null;
		
		Config conf=new Config();
		
		Session s1=conf.getSession();
		m1=s1.get(Mall.class, 103);
		System.out.println(m1);
		s1.close();
		
		
		Session s2=conf.getSession();
		m2=s2.get(Mall.class, 103);
		System.out.println(m2);
		s2.close();
		

	}

}
