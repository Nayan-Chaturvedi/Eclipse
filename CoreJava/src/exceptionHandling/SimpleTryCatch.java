package exceptionHandling;

public class SimpleTryCatch {

	public static void main(String[] args) 
	{
		int n1=0;
		int n2=20;
		
		try
		{
		System.out.println("in try block");		//proper Excecute this line
		int result =n2/n1;			 //Exception occur then below this line in try block is not excecute
		System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Error " +e.getMessage());
		}
		
		

	}

}
