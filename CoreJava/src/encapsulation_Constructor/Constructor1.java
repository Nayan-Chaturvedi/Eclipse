package encapsulation_Constructor;

class Const
{
	public Const()
	{
		
		System.out.println("Defalt constructor");
	}
	
	public Const(int x)
	{
		//this();
		this(20,"Nayan");
		System.out.println("int x Parameter constructor");
	}
	
	public Const(int s , String name)
	{
		
		System.out.println("(int s , String name) reciever constructor");
	}
}

public class Constructor1
{
	public static void main(String[] args)
	{
		Const c=new Const(20,"Nayan");
		
	}
}
