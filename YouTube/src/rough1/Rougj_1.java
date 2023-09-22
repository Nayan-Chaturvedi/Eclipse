package rough1;

import java.io.*;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.*;

public class Rougj_1
{

	public static void main(String[] args) throws IOException 
	{
		ArrayList al=new ArrayList();
		al.add(21);
		al.add(23);
		al.add("Amit");
		al.add('V');
		
		ListIterator li=al.listIterator(al.size());
		while(li.hasPrevious())
		{
			System.out.println(li.previous());
		}
		
		
	}

}
