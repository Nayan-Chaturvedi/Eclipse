package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSorting 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size of element : ");
		int size = sc.nextInt();
		
		int a[] = new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("You enter -\n" + Arrays.toString(a));
		
		bubbleSort(a);
	}
	
	public static void bubbleSort(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < a.length-1-i; j++) {
				
				if(a[j]> a[j+1])
				{
					int temp =a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
					
					swapped =true;
				}
			}
			
			if(!swapped)
			{
				break;
			}
			
			
		}
		System.out.println("Sorted array : " +Arrays.toString(a));
		
	}
	
	

}
