package multiThreading;

class Queue
{
	int x;
	boolean flag=false;
	
	synchronized public void put(int x)
	{
		try
		{
			if(flag ==true)
			{
				wait();
			}
			else
			{
				this.x=x;
				System.out.println("I have produce value " + x);
				flag=true;
				notify();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Occur ");
		}
		
	}
	
	synchronized public void get()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I have consume value " + x);
				flag=false;
				notify();
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Exception Occur");
		}
	}
}

class Producer extends Thread
{
	Queue q;
	
	Producer(Queue q)
	{
		this.q=q;
	}
	
	public void run()
	{
		int i=1;
		while(true)
		{
			q.put(i++);
		}
	}
}

class Consumer extends Thread
{
	Queue q;
	
	Consumer(Queue q)
	{
		this.q=q;
	}
	
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}
public class ProducerConsumerProblem // Inter Thread Communication
{

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		
		p.start();
		c.start();
		
				

	}

}
