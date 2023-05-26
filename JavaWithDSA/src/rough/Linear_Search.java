package rough;

import java.util.Scanner;

public class Linear_Search 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		boolean flag=true;
		
		int a[]= {1,2,3,4,5,6};
		
		System.out.println("Enter an target elements");
		int b=sc.nextInt();
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==b)
			{
				System.out.println("Element is found is pos : "+ i);
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("Element is not found");
		}
	}
	
	
	
}
