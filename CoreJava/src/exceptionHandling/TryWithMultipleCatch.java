package exceptionHandling;

public class TryWithMultipleCatch {

	public static void main(String[] args) 
	{
		
		int n1=10;
		int n2=10;
		int n3=30;
		int result =0;
		int values[]= {1,2,3,4}; 
		
		try
		{
			result = n1/n2;
			System.out.println(values[9]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Handling all types of exception . If above catch block not proper handle");
		}
	}

}
