package com.google.Persistence_Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Delete_JPA 
{
	public static void main(String[] args) 
	{
		Cricket c=null;
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		// 			READ DATA
		c=em.find(Cricket.class, 42);
		
		if(c!=null)
		{
			tx.begin();
			
			//		DELETE DATA
			em.remove(c);
			tx.commit();
			System.out.println(c);			
		}
		else
		{
			System.out.println("No data present");
		}
		
		
	}
}
