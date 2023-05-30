package recursion;

import java.util.Scanner;

public class AssignSoln_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an num");
		int n=sc.nextInt();
		
		int sum =calculateAlternateSum(n);
		
		System.out.println("Alternates Sum is : " +sum);
	}
	
	public static int calculateAlternateSum(int n)
	{
		if(n==0)
		{
			return n;
		}
		else if(n%2 ==0)
		{
			return -n + calculateAlternateSum(n-1);
		}
		else
		{
			return n+ calculateAlternateSum(n-1);
		}
	}

}
