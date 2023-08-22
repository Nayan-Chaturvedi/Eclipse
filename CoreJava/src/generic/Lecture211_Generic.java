package generic;

import java.util.*;
class Student
{
	private String Studentname;
	private int Studentid;
}

class Employee
{
	private String empname;
	private int empId;
}

public class Lecture211_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		Student st2 = new Student();
		Employee em1=new Employee();
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(st1);
		al.add(st2);
		
//		al.add(em1);  // Only Student class  data come in ArrayList
		
		System.out.println(al);
	}

}
