package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable mp = new Hashtable();
		mp.put(01, "Amit");
		mp.put(02, "Ahahuja");
		mp.put(03, "Gupta");
		
		
		mp.putIfAbsent(03, "IfAbsent");
		System.out.println(mp);
		
		Set s=mp.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry en =(Entry) itr.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		TreeMap tm =new TreeMap();
		tm.put("Nayan", 1);
		tm.put("Kumar", 2);
		
		
		
		System.out.println(tm);
		
		
	}

}
