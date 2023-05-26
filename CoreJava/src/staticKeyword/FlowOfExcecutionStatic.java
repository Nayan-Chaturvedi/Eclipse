package staticKeyword;

public class FlowOfExcecutionStatic
{
	static  int age;	//static variable first execute
	
	static	//2nd par static block execute
	{
		age=20;
		System.out.println("Static Block first execute");
	}
	
	
	public static void main(String[] args) //3rd--> static method execute 
	{
		System.out.println("Main method");
		
		
	}
}
