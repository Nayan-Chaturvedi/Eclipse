package com.google.Persistence_Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Update_JPA 
{

	public static void main(String[] args)
	{
		Cricket c=null;
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		//		READ CODE
		
		c=em.find(Cricket.class, 42);
		
		//		UPDATE CODE
		
		if(c!=null)
		{
			c.setName("Vipin_Yadav");
			tx.begin();
			em.persist(c);
			System.out.println(c);
			tx.commit();
			
		}
		else
		{
			System.out.println("Entity doe's not exist");
		}

	}

}
