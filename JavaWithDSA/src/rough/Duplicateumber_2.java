package rough;

import java.util.Scanner;

public class Duplicateumber_2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an size");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter an number at index " + i);
			a[i]=sc.nextInt();
		}
		
		duplicateNum(a);

	}
	
	public static void duplicateNum(int a[])
	 {
		boolean flag =false;
		for (int i = 0; i < a.length; i++) 
		{
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i] == a[j])
				{
					System.out.println("Duplicate number is " + a[i]);
					flag=true;
				}
			}
			
		}
		if(!flag)
		{
			System.out.println("Duplicate number is not present");
		}
	 }

}
