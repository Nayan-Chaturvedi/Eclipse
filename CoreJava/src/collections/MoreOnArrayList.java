package collections;

import java.util.*;

public class MoreOnArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(al);
		System.out.println(al); // Output=[(this Collection)]

		ArrayList al1=new ArrayList();
		al1.add(100);
		al1.add("200");
		al1.add("300");
		
		// .contans() - Returns true if this list contains the specified element.
		
		System.out.println(al1.contains(al1)); // False
		System.out.println(al1.contains(200)); // False
		System.out.println(al1.contains("200")); // true
		System.out.println(al1.contains(100)); // true
		
		/*.indexOf() - Returns the index of the first occurrence of the -
		  - specified element in this list, or -1 if this list does not -
		  - contain the element. */
		
		System.out.println(al1.indexOf("300")); // 2
		
		// .size() - Returns the number of elements in this list.
		
		System.out.println(al1.size()); // 3
		
		// .ensureCapacity() - Increases the capacity of this ArrayList
		
		al1.ensureCapacity(20);
		
		System.out.println(al1.size()); // 3
		
		// trimToSize()- Trims the capacity of this ArrayList 
		
		al1.trimToSize();
		
		// .clear() - Removes all of the elements from this list
		
		al1.clear();
		
		System.out.println(al1); // []


	}

}
