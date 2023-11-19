package com.google.Persistence_Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

public class Insert_JPA 
{
    public static void main( String[] args )
    {
        Cricket c=new Cricket();
        c.setName("Abhay_Gupta");
        c.setPlayerAge(25);
        
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit");
        EntityManager em=emf.createEntityManager();
        EntityTransaction tx=em.getTransaction(); // Get Transaction without begain
        tx.begin(); // Begain tx
        em.persist(c); // Save data
        tx.commit();
        
        System.out.println(c);
       
    }
}
