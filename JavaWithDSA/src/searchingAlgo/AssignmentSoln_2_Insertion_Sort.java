package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentSoln_2_Insertion_Sort 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("You enter is : " +Arrays.toString(a));
		
		insertionSort(a);

	}
	
	public static void insertionSort(int[] a)
	{
		for (int i = 1; i < a.length; i++) 
		{
			int j=i;
			
			while(j>0 && a[j] > a[j-1])
			{
				int temp =a[j-1];
				a[j-1] = a[j];
				a[j] =temp;
				
				j--;
			}
		}
		
		System.out.println("Sorted Arrays is : " +Arrays.toString(a));
	}

}
