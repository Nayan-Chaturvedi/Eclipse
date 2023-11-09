package in.google.Mechanical.HibernateDem;

import javax.transaction.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Teacher t1=new Teacher();
        
        t1.setTeacherId(21);
        t1.setName("Vijay");
        
        Configuration c=new Configuration().configure().addAnnotatedClass(Teacher.class);
        SessionFactory sf=c.buildSessionFactory();
        Session s=sf.openSession();
        
        org.hibernate.Transaction tx= s.beginTransaction();      
        s.save(t1);
        
        try
        {
        	tx.commit();
        }
        catch(Exception e)
        {
        	System.out.println("Error");
        }
        System.out.println(t1);
        
    }
}
