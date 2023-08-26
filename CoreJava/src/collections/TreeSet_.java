package collections;

import java.util.*;

public class TreeSet_ 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		
		ts.add(100);
		ts.add(20);
		ts.add(35);
		ts.add(21);
		ts.add(1);
		ts.add(98);
		ts.add(175);
		ts.add(26);
//		ts.add(null); // NullPointerException	
		
		System.out.println(ts); // [1, 20, 21, 26, 35, 98, 100, 175]
		
		// .higher -- greater than the given element, -
		// - or null if there is no such element.
		// Give only one value
		System.out.println(ts.higher(50)); // 98
		
		System.out.println(ts.lower(50)); // 35
		
		System.out.println(ts.ceiling(50)); // 98
		
		System.out.println(ts.floor(50)); // 35
		
		// Difference .higher(), .lower(), .ceiling() and .floor() method
		
		System.out.println(ts.ceiling(98)); // 98
		System.out.println(ts.higher(98)); // 100
		
		System.out.println(ts.floor(98)); // 98		
		System.out.println(ts.lower(98)); // 35
		
		// .ceiling() upper value dega jab jo object aap daal rahe ho -
		// - voh object Treeset me present nahii hoga tab 
		//  agar present hoga hamare Treeset me tab vahi(object jo apne dala hai) -
		// -value return kar dega
		
		// .higher() always upper value(obj) dega -
		// - chahe voh obj hamare Treeset me present ho -
		// - ya na ho.
		

		
	}

}
