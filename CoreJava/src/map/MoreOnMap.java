package map;

import java.util.*;
import java.util.Map.Entry;

class Student
{
	private String name;
	private int age;
	private String city;
	
	public Student(String name, int age, String city)
	{
		this.name =name;
		this.age = age;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	

	public int getAge() {
		return age;
	}

	

	public String getCity() {
		return city;
	}
	
	public String toString()
	{
		return name + " " + age + " " + city;
	}

	
	
	
}

public class MoreOnMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1 = new Student("Rohan", 18, "Bangalore");
		Student st2 = new Student("Rohit", 19, "Delhi");
		Student st3 = new Student("Ramesh", 22, "Lucknow");
		
		Map map = new HashMap();
		map.put(1, st1);
		map.put(2, st2);
		map.put(3, st3);
		
		System.out.println(map);
		
		System.out.println();
		Set data=map.entrySet();
		Iterator it =data.iterator();
		while(it.hasNext())
		{
			Map.Entry dat =(Entry) it.next();
			System.out.println(dat.getKey() + " " + dat.getValue());
		}
		
	}

}
