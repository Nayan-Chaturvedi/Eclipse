package in.google.Mechanical.Electri;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
       Student s1=new Student();
       
       s1.setId(31);
       s1.setName("Nayan");
       
       Configuration c=new Configuration().configure().addAnnotatedClass(Student.class);
       SessionFactory sf=c.buildSessionFactory();
       Session ss=sf.openSession();
       Transaction tx=ss.beginTransaction();
       ss.save(s1);
       tx.commit();
       System.out.println(s1);
    }
}
