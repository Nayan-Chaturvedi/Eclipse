package collections;

import java.util.*;

public class LinkedList_ 
{

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		// 	List ll=new LinkedList();
		// 	LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add("Nayan");
		ll.add('j');
		ll.addLast(35);
		ll.add(33);
		
		System.out.println(ll);
		
		// .peek() - Retrieves, but does not remove, the head (first element) of this list.

		System.out.println(ll.peek());
		System.out.println(ll); // [10, 20, 30, Nayan, j, 35, 33]
		
		// .poll() - Retrieves and removes the head (first element) of this list.
		
		System.out.println(ll.poll());
		System.out.println(ll); // [20, 30, Nayan, j, 35, 33]
		

	}

}
