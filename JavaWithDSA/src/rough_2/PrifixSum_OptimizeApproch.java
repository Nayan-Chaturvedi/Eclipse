package rough_2;

import java.util.Scanner;

public class PrifixSum_OptimizeApproch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Size of an Array");
		int size = sc.nextInt();
		
		int a[][]=new  int[size][size];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("Enter an Element ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("You enter is : ");
		
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("nter an x1 coordinates :");
		int x1 = sc.nextInt();
		
		System.out.println("Enter an y1 coorinates :");
		int y1 = sc.nextInt();
		
		System.out.println("Enter an x2 coordinates : ");
		int x2 = sc.nextInt();
		
		System.out.println("Enter an y2 coordinates :");
		int y2 = sc.nextInt();
		
		
		sumOfRow(a);
		sumOfColoumn(a);
		prifixSumOptimize(a,x1,y1,x2,y2);
	}
	
	public static void sumOfRow(int a[][])
	{
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				a[i][j]+=a[i][j-1];
			}
			
		}
		System.out.println("\n Row Sum");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void sumOfColoumn(int a[][])
	{
		for(int j=0; j<a.length; j++)
		{
			for(int i = 1; i< a.length; i++)
			{
				a[i][j] +=a[i-1][j];
			}
		}
		System.out.println(" \n Colomn sum");
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void prifixSumOptimize(int[][] a, int x1, int y1, int x2, int y2)
	{
		int sum =0, up, left, comman, findRegion;
		
		findRegion = a[x2][y2];
		up = a [x1-1][y2];
		left = a[x2][y1-1];
		comman = a[x1-1][y1-1];
		
		sum = findRegion -up - left +comman;
		
		System.out.println("\n Sum is : " +sum);
	}
}
