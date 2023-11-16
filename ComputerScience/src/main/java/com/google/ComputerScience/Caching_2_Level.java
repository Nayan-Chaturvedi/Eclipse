package com.google.ComputerScience;

import org.hibernate.Session;

public class Caching_2_Level {

	public static void main(String[] args)
	{
	// 			2-LEVEL CACHING
		
		Mall m1=null;
		Mall m2=null;
		
		Config conf=new Config();
		
		Session ses1=conf.getSession();
		m1=ses1.get(Mall.class, 101);
		System.out.println(m1);
		ses1.close();
		
		Session ses2=conf.getSession();
		m2=ses2.get(Mall.class, 102);
		System.out.println(m2);
		ses2.close();

	}

}
