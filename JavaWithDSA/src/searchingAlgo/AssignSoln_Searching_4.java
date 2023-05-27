package searchingAlgo;

import java.util.Scanner;

public class AssignSoln_Searching_4 
{

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
		
		int firstOccurance =firstNumberOccurance(arr,x);
		
		System.out.println("First occurance : " +firstOccurance);
		
		int lastOccurance = lastNumberOccurance(arr,x);
		
		System.out.println("Last occurance is : " + lastOccurance);
		
		
		if(firstOccurance == lastOccurance && firstOccurance ==-1)
		{
			System.out.println("Element " +x + " is not present");
		}
		else
		{
			System.out.println("Total Number of " + x + " present");

			System.out.println(lastOccurance-firstOccurance +1);
		}
		
	}
	
	public static int firstNumberOccurance(int[] arr,int x)
	{
		int lower_Index =0;
		int higher_Index = arr.length-1;
		int result =-1;
		
		while(lower_Index <= higher_Index)
		{
			int mid = lower_Index +(higher_Index - lower_Index)/2;
			
			if(arr[mid] == x)
			{
				result =mid;
				higher_Index = mid-1;
			}
			else if(arr[mid] > x)
			{
				higher_Index = mid-1;
			}
			else
			{
				lower_Index = mid +1;
			}
		}
		return result;
	}
	
	public static int lastNumberOccurance(int[] arr, int x)
	{
		int lower_Index =0;
		int higher_Index = arr.length-1;
		int result =-1;
		
		while(lower_Index <= higher_Index)
		{
			int mid = lower_Index + (higher_Index - lower_Index)/2;
			
			if(arr[mid]==x)
			{
				result=mid;
				lower_Index = mid+1;
			}
			
			else if(arr[mid] > x)
			{
				higher_Index = mid -1;
			}
			else
			{
				lower_Index = mid +1;
			}
		}
		return result;
	}

}
