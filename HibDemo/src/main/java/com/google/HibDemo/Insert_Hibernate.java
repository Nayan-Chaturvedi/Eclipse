package com.google.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert_Hibernate 
{
    public static void main( String[] args )
    {
       Mall m=new Mall();
       m.setShopNum(106);
       m.setShopName("Dell");
       
       Config conf=new Config();
       Session s=conf.getSession();
       Transaction tx=s.beginTransaction();
       s.save(m);
       tx.commit();
       System.out.println(m);
       s.close();
       
      
      
    }
}
