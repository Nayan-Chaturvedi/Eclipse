package rough;

import java.util.Arrays;
import java.util.Scanner;

public class OptimizeApproch_PrefixSum_1 
{

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
		givenCoordinates(arr,r1,c1,r2,c2);

	}
	
	public static void prifixSum(int [][]arr)
	{
		// transpose row
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 1; j < arr[0].length; j++) 
			{
				arr[i][j]+=arr[i][j-1];
			}
		}
		
		// transpose coloummn
		
		for (int j = 0; j < arr[0].length; j++) 
		{
			for (int i = 1; i < arr.length; i++)
			{
				arr[i][j] +=arr[i-1][j];
			}
		}
		
		System.out.println("After transpose :");
		
		for (int[] is : arr) 
		{
			for (int is2 : is)
			{
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		
	}
	
	public static void givenCoordinates(int [][]arr,int r1,int c1,int r2,int c2)
	{
		int sum =  arr[r2][c2];
		int upper = arr[r1-1][c2];
		int side = arr[r2][c1-1];
		int comman = arr[r1-1][c1-1];
		
		int result = sum - upper -side +comman;
		
		System.out.println("Sum of given index is : " + result);
	}

}
