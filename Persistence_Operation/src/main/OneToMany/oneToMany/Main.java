package oneToMany;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args)
	{
		HondaComp hc=new HondaComp();
		hc.setProductId(101);
		hc.setProductName("Car's");
		
		Car c1=new Car();
		c1.setCarId(201);
		c1.setCarName("Verna");
		
		Car c2=new Car();
		c2.setCarId(202);
		c2.setCarName("Maruti_800");
		
		ArrayList<Car> al=new ArrayList<Car>();
		al.add(c1);
		al.add(c2);
		
		//			UNI-DIRECTIONAL MAPPING
		
		hc.setCar(al);
		
		//			BI-DIRECTIONAL MAPPING
		
		c1.sethCompany(hc);
		c2.sethCompany(hc);
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit4_Mapping_OneToMany");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		tx.begin();
		em.persist(hc);
		em.persist(c1);
		em.persist(c2);
		tx.commit();
		

	}

}
