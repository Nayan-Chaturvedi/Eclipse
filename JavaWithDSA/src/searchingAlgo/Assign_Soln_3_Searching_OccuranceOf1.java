package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

// You only input o and 1 in binary search form means assending order
public class Assign_Soln_3_Searching_OccuranceOf1 {

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
		
		occuranceOfOne(a);

	}
	
	public static void occuranceOfOne(int[] a)
	{
		int min_Index =0;
		int higher_Index= a.length-1;
		
		while(min_Index <= higher_Index)
		{
			int mid = min_Index +(higher_Index - min_Index)/2;
			
			if(a[mid] == 0)
			{
				min_Index =mid +1;
			}
			else
			{
				higher_Index = mid -1;
			}
		}
		
		System.out.println("Occurance os one digit is : " + (a.length - min_Index));
	}

}
