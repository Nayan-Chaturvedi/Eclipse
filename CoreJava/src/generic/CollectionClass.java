package generic;

import java.util.*;

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(200);
		al.add(21);
		al.add(125);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("Collection class me sorting method invoke : "+al);
		
		System.out.println("********");
		
		List<String> al1=new ArrayList<String>();
		al1.add("Nayan");
		al1.add("Kumar");
		al1.add("Chaturvedi");
		al1.add("Learn");
		
		System.out.println(al1);
		
		System.out.println("Soted Order");
		
		Collections.sort(al1);
		
		System.out.println(al1);
		
		
		System.out.println("*******");
		
		List al3 =new ArrayList();
		
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(35);
		al3.add(37);
		
		int index =Collections.binarySearch(al3, 35);
		
		System.out.println("Index is : " + index);
		
		Collections.rotate(al3, 3);
		
		System.out.println(al3);
		
		Collections.reverse(al3);
		
		System.out.println(al3);
		
		
		Collections.shuffle(al3);
		
		System.out.println(al3);
		
		System.out.println(Collections.frequency(al3, 30));
		
		
		
		
	}

}
