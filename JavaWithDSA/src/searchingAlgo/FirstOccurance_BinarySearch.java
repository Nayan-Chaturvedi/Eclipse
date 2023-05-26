package searchingAlgo;

import java.util.Scanner;

public class FirstOccurance_BinarySearch
{
	public static int firstOccurance(int arr[], int target)
	{
		int lowerIndex = 0;
		int highIndex = arr.length-1;
		int result = -1;
		
		while(lowerIndex <= highIndex)
		{
			int mid = lowerIndex + (highIndex - lowerIndex)/2;
			
			if(arr[mid] == target)
			{
				result = mid;
				highIndex = mid - 1;
			}
			else if(arr[mid] < target)
			{
				lowerIndex = mid + 1;
			}
			else
			{
				highIndex = mid - 1 ;
			}
				
		}
		
		return result;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter of an size ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter an element in " + i + " index");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("You enter -- ");
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(" " + arr[i]);
		}
		
		System.out.println();
		
		System.out.println("Enter an Target element ");
		int target=sc.nextInt();
		
		int result = firstOccurance(arr,target);
		
		if(result != -1)
		{
			System.out.println("Element found in index : " +result);
		}
		else
		{
			System.out.println("Element is not present");
		}

	}

}
