package map;

import java.util.*;
import java.util.Map.Entry;

public class AccessData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put(1, "Nayan");
		map.put(2, "Rohit");
		map.put(3, "Rahul");
		map.put(4, "Ramesh");

		System.out.println(map);

		System.out.println("Access based on Keys : " + map.get(4));

		Set keySet = map.keySet(); // Iterate on key
		Iterator itr1 = keySet.iterator();

		while (itr1.hasNext()) {
			// System.out.println(itr1.next());
			Integer key = (Integer) itr1.next();
			System.out.println(key);
		}
		System.err.println();
		Collection values = map.values(); // Iterate on Data
		Iterator itr2 = values.iterator();
		while (itr2.hasNext()) {
			// System.out.println(itr2.next());
			String data = (String) itr2.next();
			System.out.println(data);
		}

		System.out.println();
		Set entry = map.entrySet(); // Iterate on Entry
		Iterator itr3 = entry.iterator();
		while (itr3.hasNext()) {
			// System.out.println(itr3.next());		//Method 1 for iterate

			/*
			 * Object entryy=itr3.next();		//Method 2 for iterate
			 *  System.out.println(entryy);
			 */
			
			Map.Entry data =(Entry) itr3.next();		//Method 3 for iterate
			System.out.println(data.getKey() + " " + data.getValue());
			

		}
	}

}
