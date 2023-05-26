package rough;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		
		System.out.println("Enter an size");
		int n= sc.nextInt();
		
		int a[]=new int[n];
		
		for (int i = 0; i < n; i++) 
		{
			System.out.println("Enter an elements");
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a.length; j++) 
			{
				if(a[i]%a[j]==0 &&a[i]%a[i]==0 && a[i]%2!=0 &&a[i]%3!=0)
				{
					System.out.println(a[i]);
					flag=false;
				}
			}
		}
		
		if(flag==true)
		{
			System.out.println("Not an prime number found");
		}

	}

}
