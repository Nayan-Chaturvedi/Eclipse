package rough;

import java.util.*;
import java.util.Map.Entry;

class Student
{
	private int age;
	private String  city;
	private String name;
	
	public Student(int age, String city, String name)
	{
		this.age = age;
		this.city = city;
		this.name = name;


	}

	public int getAge() {
		return age;
	}

	

	public String getCity() {
		return city;
	}

	

	public String getName() {
		return name;
	}
	public String toString()
	{
		return age + " " +city + " " +name;
	}
	
}

public class MoreOnMapData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student(21, "Kanpur", "Amit");
		Student st2 = new Student(22, "Delhi", "Vijay");
		
		Map map = new HashMap();
		map.put(1, st1);
		map.put(2, st2);
		
		Set s=map.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			Map.Entry en=(Entry) itr.next();
			System.out.println(en.getKey() + " " + en.getValue());
		}
		
	}

}
