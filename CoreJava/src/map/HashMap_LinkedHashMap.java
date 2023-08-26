package map;

import java.util.*;

public class HashMap_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm =new HashMap();
		hm.put(2, "Nayan");
		hm.put(21, "Hari");
		hm.put(90, "Rohit");
		hm.put(98, "21");
		hm.put(null, null);
		//hm.put(null, "09"); // For a key Null value allowed Only Once time
		
		System.out.println(hm); // {null=null, 2=Nayan, 98=21, 21=Hari, 90=Rohit}
		
		System.out.println(hm.put(9, hm)); // {null=null, 2=Nayan, 98=21, 21=Hari, 9=(this Map), 90=Sani}
		
		hm.put(90, "Sani");
		
		System.out.println(hm); // {null=null, 2=Nayan, 98=21, 21=Hari, 90=Sani}
		
		System.out.println();
		
		HashMap hm2 =new HashMap();
		hm2.put("nayan", "Chaturvedi"); // {nayan=Chaturvedi}
		System.out.println(hm2); 
		
		LinkedHashMap lhm =new LinkedHashMap(); // Order of Insertion preserved
		lhm.put(2, "Nayan");
		lhm.put(21, "Hari");
		lhm.put(90, "Rohit");
		lhm.put(98, "21");
		lhm.put(null, "32");
		
		
		System.out.println(lhm); // {2=Nayan, 21=Hari, 90=Rohit, 98=21, null=32}
		
		lhm.put(null, null); 
		
		System.out.println(lhm); // {2=Nayan, 21=Hari, 90=Rohit, 98=21, null=null}
	}

}
