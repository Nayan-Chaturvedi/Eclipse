package recursion;

import java.util.Scanner;

public class A_Power_B_BrutleApproch {
	
	public static int powerFinding(int a,int b)
	{
		if(b==1)
		{
			return a;
		}
		else
		{
			 return a * powerFinding(a,b-1);
		}
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A");
		int a=sc.nextInt();
		
		System.out.println("Enter B");
		int b =sc.nextInt();
		
		int result =powerFinding(a,b);
		System.out.println("Output : " + result);

	}

}
