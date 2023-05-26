package array_2_D;

import java.util.Scanner;

public class AssignmentSolution_Ques_1 
{
	public static void positiveNegativeNum(int[][] a)
	{
		int pos =0,neg =0,even=0,odd=0,zero=0;
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				if(a[i][j]>0)
				{
					pos++;
				}
				 if(a[i][j]<0)
				{
					neg++;
				}
				 if(a[i][j]%2==0)
				{
					even++;
				}
				if(a[i][j] %2!=0)
				{
					odd++;
				}
				if(a[i][j]==0)
				{
					zero++;
				}
			}
		}
		System.out.println("Positive number = "+pos);
		System.out.println("Negative number = "+neg);
		System.out.println("Even number = "+even);
		System.out.println("Odd number = "+odd);
		System.out.println("Zero digit = "+zero);
	}

	public static void main(String[] args) 
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an row number");
		m=sc.nextInt();
		
		System.out.println("Enter an coloumn number");
		n=sc.nextInt();
		
		int a[][]=new int[m][n];
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.println("Enter a number");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You enter -");
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		positiveNegativeNum(a);
	}

}
