package com.google.Persistence_Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Cricket c=new Cricket();
        c.setName("Sachin");
        c.setPlayer(32);
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("persistenceUnit");
        EntityManager em=emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        em.persist(c);
        et.commit();
        
        System.out.println(c);
    }
}
