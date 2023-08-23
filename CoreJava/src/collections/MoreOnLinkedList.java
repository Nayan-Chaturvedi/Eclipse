package collections;

import java.util.*;

public class MoreOnLinkedList 
{

	public static void main(String[] args)
	{
		LinkedList ll=new LinkedList();
		
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.addAll(ll); // [10, 20, 30, 10, 20, 30]
		
		System.out.println(ll);
		
		// .get(index) - Returns the element at the specified position in this list.
		
		System.out.println(ll.get(2)); // 30
		
		// .indexOf - Returns the index of the first occurrence of the specified -
		// - element in this list, or -1 if this list does not contain the element.
		
		System.out.println(ll.indexOf(30)); // 2
		
		// .lastIndexOf() - Returns the index of the last occurrence of the -
		// - specified element in this list, or -1 if this list does -
		// - not contain the element.
		
		System.out.println(ll.lastIndexOf(30)); // 5
		
		// .getLast - Returns the last element in this list
		
		System.out.println(ll.getLast()); // 30
		
		// .getFirst - Returns the First element in this list

		System.out.println(ll.getFirst()); // 10
		
		// .push() -   inserts the element at the front of this list. 
		// This method is equivalent to addFirst.

		ll.push(5);
		
		System.out.println(ll); // [5, 10, 20, 30, 10, 20, 30]
		
		// .pop() - removes and returns the first element of this list. 
		//This method is equivalent to removeFirst().

		System.out.println(ll.pop()); // 5
		
		System.out.println(ll); // [10, 20, 30, 10, 20, 30]

	}

}
