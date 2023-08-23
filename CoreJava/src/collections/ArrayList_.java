package collections;

import java.util.*;

public class ArrayList_ 
{

	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(20);
		al.add("Nayan");
		al.add('S');
		
		System.out.println(al);// [20, Nayan, S]

		
		al.add(1, "Data");
		
		al.add(" ");
		
		System.out.println(al); // [20, Data, Nayan, S,  ]
		
		al.add(null);
		
		System.out.println(al); // [20, Data, Nayan, S,  , null]

		
		List al1=new ArrayList();
		
		al1.add("PW Skill");
		al1.add(100);
		al1.add(2.1);
		al.add(2.22);
		
		System.out.println(al1 +" " + al); //[PW Skill, 100, 2.1] [20, Data, Nayan, S,  , null, 2.22]

		
		al1.add(al);
		
		System.out.println(al1); // [PW Skill, 100, 2.1, [20, Data, Nayan, S,  , null, 2.22]]

		
		al1.addAll(al);
		
		System.out.println(al1); // [PW Skill, 100, 2.1, [20, Data, Nayan, S,  , null, 2.22], 20, Data, Nayan, S,  , null, 2.22]

		
		
		
	}

}
