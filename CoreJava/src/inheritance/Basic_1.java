package inheritance;

class Student
{
	private int x;
	private int y;
	int age=18;
	
	public Student()
	{
		System.out.println("It's constructor of student");
	}
	
	void sleep()
	{
		System.out.println("It's sleep method");
	}
}


class School extends Student
{
	public School()
	{
		System.out.println("It's constructor of schoo;");
	}
	void display()
	{
		System.out.println("Age is = "+ age);
		
	}
}



public class Basic_1 
{

	public static void main(String[] args)
	{
		School s=new School();
		s.display();

	}

}
