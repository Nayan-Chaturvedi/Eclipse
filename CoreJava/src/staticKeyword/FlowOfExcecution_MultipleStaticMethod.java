package staticKeyword;

public class FlowOfExcecution_MultipleStaticMethod 
{
static int age; //static variable first execute
	
	static //2nd par static block execute
	{
		age=18;
		System.out.println("Static method");
	}
	
	static void display()// Agar call main Method me karuga tab --
	//--excecute hoga static method 
	{
		System.out.println("Static Method ..jab me call karuga tab excecute hoga");
	}

	public static void main(String[] args) //3rd--> static method execute
	{
		System.out.println("main method");
		FlowOfExcecution_MultipleStaticMethod.display();

	}

}
