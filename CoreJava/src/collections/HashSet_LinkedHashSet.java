package collections;

import java.util.*;

public class HashSet_LinkedHashSet
{

	public static void main(String[] args)
	{
		HashSet hs=new HashSet();
		
		hs.add(hs); // [(this Collection)]
		
		System.out.println(hs);
		
		HashSet hs1=new HashSet();
		hs1.add(10);
		hs1.add(21);
		hs1.add(32);
		hs1.add(90);
		hs1.add(4);
		hs1.add(75);
		hs1.add(null);
		hs1.add(75); // Duplicate not Allowed.If we add hashset does not -
		// - throw an error. Duplicate not consider.
		
		System.out.println(hs1); // [32, null, 4, 21, 10, 90, 75]
		
		LinkedHashSet lhs=new LinkedHashSet(); // Order of Insertion is preserved
		
		lhs.add(10);
		lhs.add(21);
		lhs.add(32);
		lhs.add(90);
		lhs.add(4);
		lhs.add(75);
		lhs.add(null);
		lhs.add(75); // Duplicate is not consider.
		
		System.out.println(lhs); // [10, 21, 32, 90, 4, 75, null]


	}

}
