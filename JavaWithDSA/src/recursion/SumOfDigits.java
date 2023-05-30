package recursion;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		int n=sc.nextInt();
		
		int result = sumOfDigits(n);
		System.out.println("Sum is : " +result);

	}
	
	public static int sumOfDigits(int n)
	{
		
		
		if(n==1 || n==0)
		{
			return n;
		}
		else
		{
			return n+sumOfDigits(n-1);
		}
	}

}
