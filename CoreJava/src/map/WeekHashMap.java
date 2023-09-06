package map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class WeekHashMap {

	public static void main(String[] args)
	{
		WeakHashMap whm=new WeakHashMap();
		
		String s1=new String("Nayan");
		String s2=new String("Ajay");
		String s3=new String("Vijay");
		
		whm.put(s1, "Name 1");
		whm.put(s2, "Name 2");
		whm.put(s3, "Name 3");
		
		System.out.println(whm);
		
		s2=null;
		
		// Call Garbage Collector Explicitly to remove an Weak Refreance
		
		System.gc(); 
		
		System.out.println(whm); // {Nayan=Name 1, Vijay=Name 3}


		
		
	}

}
