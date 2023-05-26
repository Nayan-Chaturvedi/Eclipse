package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentSoln_3_Selection_Sort 
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
		
		selectionSort(a);

	}
	
	public static void selectionSort(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			int max_Index =i;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[j]>a[max_Index])
				{
					max_Index =j;
				}
			}
			if(i!=max_Index)
			{
				int temp =a[i];
				a[i]=a[max_Index];
				a[max_Index]= temp;
			}
			
			System.out.println(Arrays.toString(a));
		}
		
		System.out.println("Soorted Arrays : " +Arrays.toString(a));
	}

}
