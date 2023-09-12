package generic;

import java.util.*;

class Employee1 implements Comparable<Employee1>
{
	private int age;
	private String name;
	
	
	public Employee1(int age, String name) 
	{
		this.age = age;
		this.name = name;
	}

	public int getAge() 
	{
		return age;
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return age+ " " + name;
	}


	public int compareTo(Employee1 emp)
	{
		if(this.age> emp.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class Comparable_ 
{

	public static void main(String[] args) 
	{
		Employee1 emp1=new Employee1(21, "Nayan");
		Employee1 emp2=new Employee1(34, "Vijay");
		Employee1 emp3=new Employee1(4, "Anoop");

		
		List<Employee1> al=new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		
		Collections.sort(al);
		
		System.out.println(al);

	}

}
