package map;

import java.util.*;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hs=new HashMap();
		hs.put(01, "Nayan");
		hs.put(02, "Rohit");
		hs.put(03, "Rohan");
		hs.put(null, "Nayan"); // Data/Value same but key is unique
		
		hs.put(03, "Rohan"); // Key is not unique so it's not print
		
		System.out.println(hs);
		
		HashMap hs2=new HashMap();
		hs2.put('n', "18"); // charater type key
		hs2.put("String type key", "90");
		System.out.println("Order of insertion is not mentained");
		
		System.out.println(hs2);
		
		
	}

}
