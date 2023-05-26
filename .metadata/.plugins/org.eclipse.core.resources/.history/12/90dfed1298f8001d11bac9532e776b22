package array_2_D;

import java.util.Iterator;
import java.util.Scanner;

public class OptimizeApproch_PrefixSum 
{
	public static void prifixSum(int arr[][])
	{
		// row prifix
		int c,d;
		c=arr.length;
		d=arr[0].length;
		
		for (int i = 0; i < c; i++) 
		{
			for (int j = 1; j < d; j++) 
			{
				arr[i][j]+=arr[i][j-1];
			}
		}
		
		//coloumn prifix
		
		for (int j = 0; j < d; j++)
		{
			for (int i = 1; i < c; i++) 
			{
				arr[i][j]+=arr[i-1][j];
			}
		}
		
		System.out.println("Transpose of row and coloumn --> \n");
	
		for (int i = 0; i < c; i++) 
		{
			for (int j = 0; j < d; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	public static void sumOfCoordinates(int [][]arr, int r1, int r2,int c1,int c2)
	{
		int sum=0,up,left,repeatedRegion;
		
		sum=arr[r2][c2];
		up=arr[r1-1][c2];
		left =arr[r2][c1-1];
		repeatedRegion=arr[r1-1][c1-1];
		
		int result =sum -up-left +repeatedRegion;
		
		System.out.println();
		System.out.println("Sum of coordinate is : " + result);
	}
	
	
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter row -");
		a=sc.nextInt();
		System.out.println("Enter a coloumn - ");
		b=sc.nextInt();
		
		int arr[][]=new int[a][b];
		
		for (int i = 0; i < a; i++)
		{
			for (int j = 0; j < b; j++) 
			{
				System.out.println("Enter element");
				arr[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("You enter is -");
		for (int i = 0; i < a; i++) 
		{
			for (int j = 0; j < b; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		int r1,r2,c1,c2;
		
		System.out.println("Enter r1 coordinate");
		r1=sc.nextInt();
		
		System.out.println("Enter c1 coordinate");
		c1=sc.nextInt();
		
		System.out.println("Enter r2 coordinate");
		r2=sc.nextInt();
		
		System.out.println("Enter c2 coordinate");
		c2=sc.nextInt();
		
		
		
		prifixSum(arr);
		
		sumOfCoordinates(arr ,r1,r2,c1,c2);
	

	}

}
