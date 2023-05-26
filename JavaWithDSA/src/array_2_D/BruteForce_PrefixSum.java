package array_2_D;

import java.util.Scanner;

public class BruteForce_PrefixSum 
{
	public static int findSumMatrix(int d[][],int r1,int r2,int c1,int c2)
	{
		int sum=0;
		
		for(int i=r1; i<=r2; i++)
		{
			for (int j = c1; j <= c2; j++) 
			{
				sum+=d[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int n,m;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an row of Matrix");
		n=sc.nextInt();
		System.out.println("Enter an coloumn of an Matrix");
		m=sc.nextInt();
		
		int a[][] = new int[n][m];

		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				System.out.println("Enter an element in " + a[i][j] +" position " );
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You enter --");
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();			
		}
		
		int r1, r2, c1, c2;
		
		System.out.println("enter an r1 coordinate");
		r1=sc.nextInt();
		
		System.out.println("enter an c1 coordinate");
		c1=sc.nextInt();
		
		System.out.println("enter an r2 coordinate");
		r2=sc.nextInt();
		
		System.out.println("enter an c2 coordinate");
		c2=sc.nextInt();
		
		int result =findSumMatrix(a,r1,r2,c1,c2);
		
		System.out.println("Sum of elements of given in rectangle - " + result );
		

	}

}
