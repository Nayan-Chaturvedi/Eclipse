package enumerate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args) 
	{
		EnumTypeData e=new EnumTypeData();
		e.setAge(23);
		e.setName("Shyam");
		e.setMonths(Months.MARCH);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit3_Enum");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(e);
		tx.commit();
		System.out.println(e);
		

	}

}
