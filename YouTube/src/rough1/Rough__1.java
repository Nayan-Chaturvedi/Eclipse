package rough1;

class Queue
{
	int x;
	boolean flag= false;
	
	public synchronized void get(int x)
	{
		try
		{
			if(flag==true)
			{
				wait();	
			}
			else
			{
				this.x=x;
				System.out.println("I have Produce value " + x);
				flag=true;
				notify();
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Error Occur");
		}
	}
	
	synchronized public void set()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I have Consume value "+ x);
				flag=false;
				notify();
			}

		}
		catch(Exception e)
		{
			System.out.println("Error Occur");
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
		int i=0;
		while(true)
		{
			q.get(++i);
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
			q.set();
		}
	}
}

class Rough__1
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