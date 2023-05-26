package encapsulation_Constructor;

class Students
{
	private String name;
	private int age;
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
	
	
		
	
}

public class Getters_Setters {

	public static void main(String[] args) 
	{
		Students s = new Students();
		s.setAge(20);
		s.setName("Amit Gupta");
		System.out.println(s.getAge() +" = age");
		System.out.println(s.getName() + " = Name");

	}

}
