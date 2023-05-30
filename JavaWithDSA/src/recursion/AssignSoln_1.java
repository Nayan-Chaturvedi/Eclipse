package recursion;

import java.util.Scanner;

public class AssignSoln_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		int n=sc.nextInt();
		
		int result=sumOfDigits(n);
		System.out.println("Sum : " +result);

	}
	
	public static int sumOfDigits(int n)
	{
		if(n ==0)
		{
			return n;
		}
		else
		{
			return (n%10) + sumOfDigits(n/10);
		}
	}

}
