package generic;

import java.util.*;

public class CollectionClass // Collection(I) is different and Collection(C) is different
{

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		
		al.add(10);
		al.add(200);
		al.add(21);
		al.add(125);
		
		System.out.println(al);
		
		// Collection class me sabhi method static hote hai
		//  static method invoke = className.methodName 
		
		Collections.sort(al); // [10, 21, 125, 200]
		
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
		
		System.out.println(al1);  // [Chaturvedi, Kumar, Learn, Nayan]
		
		
		System.out.println("*******");
		
		List al3 =new ArrayList();
		
		al3.add(10);
		al3.add(20);
		al3.add(30);
		al3.add(35);
		al3.add(37);
		
		int index =Collections.binarySearch(al3, 35);
		
		System.out.println("Index is : " + index); // 3
		
		Collections.rotate(al3, 3); // [30, 35, 37, 10, 20]

		System.out.println(al3); 
		
		Collections.reverse(al3); // // [20, 10, 37, 35, 30]
		
		System.out.println(al3);
		
		
		Collections.shuffle(al3);
		
		System.out.println(al3);
		
		System.out.println(Collections.frequency(al3, 30)); // 1
		
		
		
		
	}

}
