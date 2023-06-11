package rough;

import java.util.Scanner;

public class Power_BrutleApproch {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A");
		int a = sc.nextInt();
		
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		int result =powerFinding(a,b);
		System.out.println("Result : " + result);

	}
	
	public static int powerFinding(int a,int b)
	{
		int result=0;
		
		if(b==1)
		{
			return a;
		}
		else
		{
			return result= a * powerFinding(a, b-1);
		}
	}

}
