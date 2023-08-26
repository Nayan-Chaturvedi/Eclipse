package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Legacy_Class 
{

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(10);
		v.add(20);
		v.add(30);
		
		System.out.println(v);
		
		Enumeration en=v.elements();
		
		while(en.hasMoreElements())
		{
			int i=(int) en.nextElement();
			System.out.print(i +" ");
			
		}
		
		
		
	}

}
