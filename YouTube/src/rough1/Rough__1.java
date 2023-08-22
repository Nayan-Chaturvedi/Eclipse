package rough1;

class Queue
{
	int x;
	boolean flag=false;
	
	public synchronized void setData(int x)
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
				System.out.println("I produce value " + x);
				flag=true;
				notify();
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Error Occur");
		}
	}
	
	public synchronized void getData()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I consume value " + x);
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
		int i=1;
		while(true)
		{
			q.setData(i++);
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
			q.getData();
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