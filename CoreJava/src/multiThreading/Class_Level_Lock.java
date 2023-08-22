package multiThreading;

class Demooo
{
	public static synchronized void m1() // Always use STATIC keyword in -
										//- Class Level Lock
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}
}

class Demo22 extends Thread
{
	Demooo d;
	
	Demo22(Demooo d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.m1();
	}
}
public class Class_Level_Lock 
{

	public static void main(String[] args) 
	{
		Demooo d=new Demooo();
		Demooo dd=new Demooo();
		
		Demo22 t1=new Demo22(d);
		Demo22 t2=new Demo22(dd);
		
		t1.start();
		t2.start();
	}

}
