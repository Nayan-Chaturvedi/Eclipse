package staticKeyword;

class Demo
{
	static int a;
	static int b;
	
	int m;		// instance variable OR object variable
	int n;
	
	static
	{
		a=10;
		b=20;
		System.out.println("In Static block");
		
	}
	
	{
		m=100;
		n=200;
		System.out.println("Non static block");
	}
	
	static void display1()
	{
		System.out.println("Value of Static Variable a = " + a);
		System.out.println("Value of Static Variable b = " + b);

	}
	
	 void display2()
	{
		System.out.println("Value of  instance /object Variable a = " + m);
		System.out.println("Value of  instance/object Variable b = " + n);

	}
}

public class ProjectStatic 
{

	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Demo.display1(); // d.display1(); <-- ye bhi likh sakte hai
		d.display2();
		

	}

}
