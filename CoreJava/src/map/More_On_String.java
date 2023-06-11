package map;
import java.util.Map.*;
class Student
{
	private String name;
	private int age;
	private String city;
	
	public Student(String name, int age, String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return name + " " +age +" " +city;
	}
}

public class More_On_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("Nayan",18,"Gwalior");
		Student s2=new Student("Rohit",19,"Agra");
		Student s3=new Student("Ramesh",33,"Delhi");
		
		Map map=new Map();
		
		
		//System.out.println(map);
	}

}
