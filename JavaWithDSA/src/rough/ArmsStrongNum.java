package rough;

import java.util.Scanner;

public class ArmsStrongNum {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an number");
		int a=sc.nextInt();
		//int l=a.length();
		int pro=1;
		int d[]=new int[a];
		int pr=0;
		
		
		
		for (int i = 0; i < d.length; i++) 
		{
			pr=d[i]*d.length ;
		}
		System.out.println(pr);
		
		
		
		

	}

}
