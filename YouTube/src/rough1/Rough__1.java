package rough1;

import java.util.Scanner;

class Queue
{
	int x;
	Boolean flag=false;
	
	 synchronized public void produceData(int x)
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
				System.out.println("I have produce " + x);
				flag=true;
				notify();
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occur");
		}
	}
	
	synchronized public void consumeData()
	{
		try
		{
			if(flag==false)
			{
				wait();
			}
			else
			{
				System.out.println("I have consume " + x);
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
		while(i<15)
		{
			q.produceData(i++);
			i++;
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
		int i=0;
		while(i<15)
		{
			q.consumeData();
			i++;
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
