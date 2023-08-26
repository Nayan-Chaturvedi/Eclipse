package collections;

import java.util.*;

public class ArrayDeque_ 
{

	public static void main(String[] args)
	{
		ArrayDeque dq=new ArrayDeque();
		
		dq.add(10);
		dq.add(20);
		
		System.out.println(dq);
		
		// .offer() - Inserts the specified element at the end of this deque. 
		// Similar to offerLast() 
		// Offer() simialar hai add() ke par offer() main mandatory nahi hai ki -
		// - data add hi hoga
		
		
		
		dq.offer(30); // [10, 20, 30]
		
		System.out.println(dq);
		
		dq.offerFirst(5);
		
//		dq.add(null); // NullPointerException -- Null value  is Not  alloowed
		
		System.out.println(dq); // [5, 10, 20, 30]
		
	}

}
