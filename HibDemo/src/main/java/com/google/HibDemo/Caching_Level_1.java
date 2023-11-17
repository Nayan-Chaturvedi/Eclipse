package com.google.HibDemo;

import org.hibernate.Session;

public class Caching_Level_1
{

	public static void main(String[] args)
	{
		Mall m1=null;
		Mall m2=null;
		
		Config conf=new Config();
		Session s=conf.getSession();
		m1=s.get(Mall.class, 104);
		m2=s.get(Mall.class, 104);
		System.out.println(m1);
		System.out.println(m2);
		s.close();
		
		

	}

}
