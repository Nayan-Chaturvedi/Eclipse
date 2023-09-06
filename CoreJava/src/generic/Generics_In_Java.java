package generic;

import java.util.ArrayList;

class Student
{
	private String name;
	private int id;
	
	
}

class Employee
{
	private String name;
	private int id;
}


class Generics_In_Java
{
	public static void main(String[] args) 
	{
		Student st1=new Student();
		Student st2=new Student();
		Employee emp=new Employee();
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(st1);
		al.add(st2);
		
//		al.add(emp);	//  C.E. - Only Student Type data is allow
		
		
	}
}