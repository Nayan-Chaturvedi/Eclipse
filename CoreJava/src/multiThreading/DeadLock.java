package multiThreading;

class DeadLock1 implements Runnable
{
	String s1=new String("DSA");
	String s2=new String("SQL");
	String s3=new String("JAVA");
	
	public void run()
	{
		String name=Thread.currentThread().getName();
		if(name.equals("Ram"))
		{
			try
			{
				Thread.sleep(2000);
				synchronized (s1)
				{
					System.out.println("Ram accquired " + s1);
					Thread.sleep(2000);
					synchronized(s2)
					{
						System.out.println("Ram accquired " + s2);
						synchronized(s3)
						{
							System.out.println("Ram accquired " + s3);
						}
					}
					
				}
			}
			catch(Exception e)
			{
				System.out.println("Error Occur");
			}
		}
		else
		{
			try
			{
				Thread.sleep(2000);
				synchronized (s3)
				{
					System.out.println("Shayam accquired " + s3);
					Thread.sleep(2000);
					synchronized(s2)
					{
						System.out.println("Shayam accquired " + s2);
						synchronized(s1)
						{
							System.out.println("Shayam accquired " + s1);
						}
					}
					
				}
			}
			catch(Exception e)
			{
				System.out.println("Error Occur");
			}	
		}
		
	}
	
	
}
public class DeadLock 
{

	public static void main(String[] args) 
	{
		DeadLock1 d=new DeadLock1();
		
		Thread t1=new Thread(d);
		Thread t2=new Thread(d);
		
		t1.setName("Ram");
		t2.setName("Shayam");
		
		t1.start();
		t2.start();
	}

}
