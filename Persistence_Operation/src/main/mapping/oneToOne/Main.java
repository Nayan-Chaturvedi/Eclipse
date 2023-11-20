package oneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

	public static void main(String[] args)
	{
		Question ques1=new Question();
		Question ques2=new Question();
		Question ques3=new Question();
		
		ques1.setQuesionNum(101);
		ques1.setQues("What_JAVA");
		ques2.setQuesionNum(102);
		ques2.setQues("FullForm_OS");
		ques3.setQuesionNum(103);
		ques3.setQues("FullForm_DBMS");
		
		Answer ans1=new Answer();
		Answer ans2=new Answer();
		Answer ans3=new Answer();
		
		ans1.setAnswerId(201);
		ans1.setAns("Programming_Language");
		ans2.setAnswerId(202);
		ans2.setAns("Operating_System");
		ans3.setAnswerId(203);
		ans3.setAns("Database_Management_System");
		
		//			MAPPING (UNI-DIRECTIONAL)
		
		ques1.setAnswer(ans1);
		ques2.setAnswer(ans2);
		ques3.setAnswer(ans3);
		
		//			MAPPING(BI-DIRECTIONAL)
		
		ans1.setQuestion(ques1);
		ans2.setQuestion(ques2);
		ans3.setQuestion(ques3);
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit2_Mapping");
		EntityManager em=emf.createEntityManager();
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.persist(ques1);
		em.persist(ques2);
		em.persist(ques3);
		em.persist(ans1);
		em.persist(ans2);
		em.persist(ans3);
		tx.commit();
		
		System.out.println(ques1);
		System.out.println(ques2);
		System.out.println(ques3);
		
		System.out.println(ans1);
		System.out.println(ans2);
		System.out.println(ans3);
		
		
	}

}
