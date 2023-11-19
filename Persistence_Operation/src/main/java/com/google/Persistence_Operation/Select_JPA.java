package com.google.Persistence_Operation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Select_JPA {

	public static void main(String[] args) 
	{
		Cricket c=null;
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit");
		EntityManager em=emf.createEntityManager();
		c=em.find(Cricket.class, 28);
		System.out.println(c);
	}

}
