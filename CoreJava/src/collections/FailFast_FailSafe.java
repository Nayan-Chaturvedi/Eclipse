package collections;

import java.util.*;

import java.util.concurrent.CopyOnWriteArrayList; // FailSafe

public class FailFast_FailSafe 
{

	public static void main(String[] args) 
	{
		ArrayList al =new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(3);
		al.add(40);
		al.add(21);
		
					// 	FailFast
		
		for(int i=0; i< al.size(); i++)
		{
			System.out.print(al.get(i) +" ");
			//al.add(10);
		}
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
//			al.add(10); // ConcurrentModificationException  
		}
		
		
		
					// 	FailSafe
		
		CopyOnWriteArrayList a=new CopyOnWriteArrayList();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		Iterator it=a.iterator();
		while(it.hasNext())
		{		
			System.out.print(it.next()+" ");
			a.add(14);			
		}
	}

}
