package API;

import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;


public class ForEachMethod {

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(32);
		al.add(21);
		al.add(31);
		al.add(1);
		
		System.out.println(al);
		
		// Using inbuilt method to create list Collection
		List al1=Arrays.asList(34, 21, 32, 8);
		
		System.out.println(al1); // [34, 21, 32, 8]
		
		System.out.println();
		
		// Accessing Data in List
		// 1-way is ForEach loop
		
		for(Object obj: al1)
		{
			System.out.println(obj);
		}
		
		System.out.println();
		
		// By inbilt method Accessing data
		
		// Using Annonymous inner class
		
		Consumer<Integer> con =new Consumer<Integer>()
				{
			public void accept(Integer i)
			{
				System.out.print(i +" ");
			}
				};
				
		al1.forEach(con); // 34 21 32 8
				
		
		// using Lambda Expression
		
		System.out.println();
		
		al1.forEach(n->System.out.println(n));  // 34 21 32 8
		
		
	}

}
