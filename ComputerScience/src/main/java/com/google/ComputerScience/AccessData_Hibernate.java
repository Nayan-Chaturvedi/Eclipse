package com.google.ComputerScience;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccessData_Hibernate 
{
    public static void main( String[] args ) throws Exception
    {
    	Mall m=null;
    	Config conf=new Config();
    	Session ses=conf.getSession();
    	
    	m=ses.get(Mall.class, 102);
    	System.out.println(m);
    	
       
    }
}
