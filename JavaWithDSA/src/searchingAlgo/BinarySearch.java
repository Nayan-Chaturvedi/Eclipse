package searchingAlgo;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearchAlgo(int []arr, int target)
	{
		int lowerIndex=0;
		int higherIndex=arr.length-1;
		
		while(lowerIndex <= higherIndex)
		{
			int mid=lowerIndex +(higherIndex - lowerIndex)/2;
			{
				if(arr[mid] == target)
				{
					return mid;
				}
				else if(arr[mid]< target)
				{
					lowerIndex=mid+1;
				}
				else
				{
					higherIndex=mid-1;
				}
			}
			
			
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size");
		int a=sc.nextInt();
		
		
		int arr[]=new int[a];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter an element at " + i +" index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter an Target elements");
		int x=sc.nextInt();
		
		
		System.out.println("You enter is --");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
		
		
		
		int result= binarySearchAlgo(arr,x);
		
		if(result!=0)
		{
			System.out.println("Target element pos : " + result);
		}
		else
		{
			System.out.println(result);
		}
	}

}
