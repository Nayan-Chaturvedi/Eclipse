package rough;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println("Enter an element at index " +i);
			a[i]=sc.nextInt();
		}
		
		bubbleSort(a);

	}
	
	public static void bubbleSort(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			boolean swap =false;
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j+1];
					a[j+1] =a[j];
					a[j]=temp;
					
					swap =true;
				}
			}
			if(!swap)
			{
				break;
			}
		}
		
		System.out.println("Sorted array is : "+ Arrays.toString(a));
	}

}
