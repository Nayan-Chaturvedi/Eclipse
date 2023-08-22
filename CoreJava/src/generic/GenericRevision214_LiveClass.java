package generic;

import java.util.*;

class Student12
{
	int marks;
	int age;
	String name;
	public Student12(int marks, int age, String name) {
		super();
		this.marks = marks;
		this.age = age;
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	public String toString()
	{
		return ""+ marks+ " "+ age +" " + name;
	}
	
	
}

class Alpha implements Comparator<Student12>
{

	@Override
	public int compare(Student12 a, Student12 b) 
	{
		// TODO Auto-generated method stub
		if(a.age>b.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}

public class GenericRevision214_LiveClass {

	public static void main(String[] args) 
	{
		Student12 st1=new Student12(45, 18, "Nayan");
		Student12 st2 =new Student12(48, 32, "Rohit");
		Student12 st3 = new Student12(51, 23, "Rohan");
		
		Alpha alpha = new Alpha();

		List<Student12> list=new ArrayList();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		
		Collections.sort(list, alpha);
		
		System.out.println(list);
		
		
		

	}

}
