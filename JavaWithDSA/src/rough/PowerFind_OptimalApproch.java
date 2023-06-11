package rough;

import java.util.Scanner;

public class PowerFind_OptimalApproch {

	public static void main(String[] args) {

		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A");
		int a = sc.nextInt();
		
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		int result =powerFinding(a,b);
		System.out.println("Result : " + result);

	}
	
	public static int powerFinding(int a, int b)
	{
		int result=0;
		if(b==1)
		{
			return a;
		}
		else
		{
			int mid=b/2;
			result= powerFinding(a, mid);
			int finalResult = result*result;
			
			if(b%2==0)
			{
				return finalResult;
			}
			else
			{
				return a*finalResult;
			}
		}
	}

}
