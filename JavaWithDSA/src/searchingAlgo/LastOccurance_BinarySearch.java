package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class LastOccurance_BinarySearch 
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
		
		System.out.println("Enter an target element");
		int target = sc.nextInt();
		
		int result = lastOccurance(a,target);
		System.out.println("Last occrance is : " + result);
	}
	
	public static int lastOccurance(int[] a,int target)
	{
		int lower_Index =0;
		int higher_Index = a.length-1;
		int result = -1;
		
		while(lower_Index <= higher_Index)
		{
			int mid = lower_Index + ( higher_Index - lower_Index)/2;
			
			if(a[mid] == target)
			{
				result =mid;
				lower_Index = mid +1;
			}
			
			else if(a[mid] < target)
			{
				lower_Index = mid+1;
			}
			else
			{
				higher_Index = mid-1;
			}
		}
		return result;
		
	}

}
