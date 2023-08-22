package rough;

import java.util.*;
import java.util.Map.Entry;
import java.lang.Integer;

public class MoreOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map map = new HashMap();
		map.put(01, "Nayan");
		map.put(02, "Aditya");
		map.put(03, "Vimal");
		map.put(04, "Vijay");
		
		System.out.println(map);
		System.out.println(map.get(03));
		
		System.out.println();
		
		System.out.println("String -- \n");
		Collection data=map.values();
		Iterator dat=data.iterator();
		while(dat.hasNext())
		{ 
//			System.out.println(dat.next());
			
			String s=(String)dat.next();
			System.out.println(s);
		}
		
		System.out.println("Key-- \n");
		Set s=map.keySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
//			System.out.println(itr.next());
			Integer in=(Integer) itr.next();
			System.out.println(in + "\n");
		}
		
		Set m=map.entrySet();
		Iterator itr2=s.iterator();
		while(itr2.hasNext())
		{
			Map.Entry entry= (Entry) itr2.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
	}

}
