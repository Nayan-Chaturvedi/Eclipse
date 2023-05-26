package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSorting_ {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
		}
		
		selectionSort(a);

	}
	
	public static void selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			
			int min_Index =i;
			
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[min_Index])
				{
					int temp =j;
					j=min_Index;
					min_Index=temp;
				}
			}
			
			if(i!=min_Index)
			{
				int temp= arr[min_Index];
				arr[min_Index]=arr[i];
				arr[i]=temp;
			}
			
		}
		
		System.out.println("Sorted array --");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
