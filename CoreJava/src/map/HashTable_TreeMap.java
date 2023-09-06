package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;;

public class HashTable_TreeMap 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable mp = new Hashtable();
		mp.put(01, "Amit");
		mp.put(02, "Ahahuja");
		mp.put(03, "Gupta");
		
		// .putIfAbsent() -  Agar 03 key par Gupta absent hoga ya -
							// - 03 key par koi data present nahi hoga -
							// -tab Nayan aa jaega agar already present hai -
							// - 03 key par data tab Nayan nahi aaega
		
		mp.putIfAbsent(03, "Nayan"); 
		
		System.out.println(mp);
		
		Set s=mp.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry en =(Entry) itr.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
		TreeMap tm =new TreeMap();
		tm.put(1,"Nayan");
		tm.put(2,"Kumar");
		
		
		
		System.out.println(tm);
		
		
	}

}
