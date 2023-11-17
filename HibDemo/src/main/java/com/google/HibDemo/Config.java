package com.google.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Config
{

	public Session getSession()
	{
		Configuration conf=new Configuration().configure().addAnnotatedClass(Mall.class);
	       SessionFactory sf=conf.buildSessionFactory();
	       Session s =sf.openSession();
	       return s;
	}

}
