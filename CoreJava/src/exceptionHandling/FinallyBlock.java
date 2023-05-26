package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			n=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println("If we give an input alphbetical ,but n=sc only handle integer value");
			System.exit(1);
		}
		finally
		{
			System.out.println("Always excecute");
		}

	}

}
