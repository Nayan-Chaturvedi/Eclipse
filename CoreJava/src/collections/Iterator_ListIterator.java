package collections;

import java.util.*;

public class Iterator_ListIterator
{

	public static void main(String[] args)
	{
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(12);
		al.add(1);
		al.add(16);
		al.add(19);
		
		// For Loop
		for(int i=0; i<al.size(); i++)
		{
			System.out.print(al.get(i) +" ");
		}
		
		System.out.println();
		
		// For each Loop
		for(Object a: al)
		{
			System.out.print(a +" ");
		}
		
		System.out.println();
		
		// Iterator
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer) itr.next();
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// ListIterator
		ListIterator litr=al.listIterator(al.size());
		while(litr.hasPrevious())
		{
			System.out.print(litr.previous()+" ");
		}
	}

}
