package array_2_D;

import java.util.Scanner;

public class AssignmentSolution_Ques_5 
{
	public static void middleRowPrint(int[][]a)
	{
		int m=a.length;
		int n= a[0].length;
		
		for (int i = 0; i < m; i++) 
		{
			System.out.println(a[i][m/2] + " ");
		}
		for (int i = 0; i < n; i++) 
		{
			if(i==n/2)
			continue;
			System.out.println(a[n/2][i] + " ");
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
		
		middleRowPrint(a);

	}

}
