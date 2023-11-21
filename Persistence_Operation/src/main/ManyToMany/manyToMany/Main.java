package manyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.setStudentid(101);
		s1.setStudentName("Vikas_Gupta");
		
		Student s2=new Student();
		s2.setStudentid(102);
		s2.setStudentName("Abhay_Kumar_Verma");
		
		Teacher t1=new Teacher();
		t1.setTeacherId(201);
		t1.setTeacherName("Anjali_Sharma");
		
		Teacher t2=new Teacher();
		t2.setTeacherId(202);
		t2.setTeacherName("Priya_Dubey");
		
		//		MAPPING
		
		List<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		
		List<Teacher> teacher =new ArrayList<Teacher>();
		teacher.add(t1);
		teacher.add(t2);
		
		s1.setTeach(teacher);
		t1.setStd(student);	// This method throw an error whats an issue
		
		
		//			BOILER-PLATE CODE
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("PersistenceUnit_ManyoMany");
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction tx=em.getTransaction();
		
		tx.begin();
		em.persist(s1);
		em.persist(s2);
		em.persist(t1);
		em.persist(t2);
		tx.commit();
		
		
	}

}
