package multiThreading;

class Demo
{
	public synchronized void m1()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(Thread.currentThread().getName() + " " +i);
		}
	}
}

class Demo2 extends Thread
{
	Demo d;
	
	Demo2(Demo d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.m1();
	}
}
public class Object_Level_Lock 
{

	public static void main(String[] args)
	{
		Demo d=new Demo();
		Demo2 d1=new Demo2(d);
		Demo2 d2=new Demo2(d);
		
		d1.start();
		d2.start();
	}

}
