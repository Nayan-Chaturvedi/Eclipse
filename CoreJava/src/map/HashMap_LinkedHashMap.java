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
		hm.put(null, "32");
		//hm.put(null, "09");
		
		System.out.println(hm);
		
		System.out.println();
		
		HashMap hm2 =new HashMap();
		hm2.put("nayan", "Chaturvedi");
		System.out.println(hm2);
		
		LinkedHashMap lhm =new LinkedHashMap();
		lhm.put(2, "Nayan");
		lhm.put(21, "Hari");
		lhm.put(90, "Rohit");
		lhm.put(98, "21");
		lhm.put(null, "32");
		
		System.out.println(lhm);
		
	}

}
