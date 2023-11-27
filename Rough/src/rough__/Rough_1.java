package rough__;

class Queue
{
	int num;
	boolean flag=false;
	
	  synchronized public void produce(int num)
	{
		try
		{
			if(flag==true)
			{
				wait();
			}
			else
			{
				this.num=num;
				System.out.println("Producer produce : " +num);
				flag=true;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Occur");
		}
		
	}
	
	synchronized public void consume()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("Consume : " +num);
				flag=false;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occur");
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
		int num=1;
		while(num<15)
		{
			q.consume();
			num++;
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
		int num=1;
		while(num<15)
		{
			q.produce(num);
			num++;
		}
	}
}
public class Rough_1
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