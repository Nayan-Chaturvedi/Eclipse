package recursion;

import java.util.Scanner;

public class Factorial_Num {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		int n=sc.nextInt();
		
		//function call
		int result = factorialFunction(n);
		System.out.println("Factorial of a given number : " +result);

	}
	
	public static int factorialFunction(int n)
	{
		int result =0;
		// Base condition
		if(n==0 || n==1)
		{
			return 1;
		}
		else
		{
			// Recursive function call
			result = n* factorialFunction(n-1);
		}
		
		return result;
	}

}
