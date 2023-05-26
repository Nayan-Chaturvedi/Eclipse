package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an size ");
		int size = sc.nextInt();
		
		int arr[]= new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an element at index : " +i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("You enter : " + Arrays.toString(arr));
		
		insertionSort(arr);

	}
	
	public static void insertionSort(int[] arr)
	{
		for (int i = 1; i < arr.length; i++) {
		
			int j=i;
			
			while(j>0 && arr[j]<arr[j-1])
			{
				int temp =arr[j];
				arr[j]=arr[j-1];
				arr[j-1]=temp;
				
				j--;
			}
		}
		
		System.out.println("Sorted array : " + Arrays.toString(arr));
	}

}
