package array_2_D;

import java.util.Scanner;

public class AssignmentSolution_Ques_3 
{
	public static void printBothDiagonals(int a[][])
	{
		for (int i = 0; i < a.length; i++) 
		{
			
			System.out.print(a[i][i] + " ");
			
			if(i!=a.length-i-1)
			{
				System.out.print(a[i][a.length-i-1] + " ");
			}
		}
	}
	public static void main(String[] args) 
	{
		int m,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an row");
		m=sc.nextInt();
		System.out.println("Enter an coloumn");
		n=sc.nextInt();
		
		int a[][]=new int[m][n];
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.println("Enter an element");
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You enter --");
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		printBothDiagonals(a);

	}

}
