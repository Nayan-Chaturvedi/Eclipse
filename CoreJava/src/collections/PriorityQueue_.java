package collections;

import java.util.*;

public class PriorityQueue_ 
{
	public static void main(String[] args) 
	{
		Queue pq=new PriorityQueue();
		
		// pq.add(pq); // Runtime Exception occur
		
		System.out.println(pq); // []
		
		pq.add("p");
		pq.add("qw");
		pq.add("hl");
		pq.add("na");
		pq.add("sd");
		
//		pq.add(10); 	// ClassCastException - Homogeneous data is allowed
		
//		pq.add(null); // NullPointerException - Null Value is not allowed
		
		System.out.println(pq);
	}

}
