package rough;

import java.util.Arrays;
import java.util.Scanner;

public class InsetionSort_2 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size ");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
		}
		System.out.println();
		
		System.out.println("You enter is : " +Arrays.toString(a));
		
		System.out.println();
		
		selectionSort(a);

	}
	
	public static void selectionSort(int []a)
	{
		for (int i = 0; i < a.length; i++) 
		{
		
			int j = i;
			{
				while(j>0 && a[j-1]>a[j])
				{
					int temp = a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
					j--;
				}
			}
		}
		
		System.out.println("Sorted array is : " +Arrays.toString(a));
	}

}
