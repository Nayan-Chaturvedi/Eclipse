package rough;

import java.util.*;

public class SelectionSort_2 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size");
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
			int min_index =i;
			
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j]< a[min_index])
				{
					min_index = j;
				}
			}
			if(i!=min_index)
			{
				int temp = a[min_index];
				a[min_index] =a[i];
				a[i]= temp;
			}
		}
		
		System.out.println("Sorted array is : " + Arrays.toString(a));
	}

}
