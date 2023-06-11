package recursion;

import java.util.Scanner;

public class BinarySearchUsingRecuursion {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size of an Array");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println("Enter an element at index " +i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter an target element");
		int target =sc.nextInt();
		
		int lowerIndex=0;
		int higherIndex =a.length-1;
		
		int result = binarySearch_1(a,target,lowerIndex,higherIndex);
		
		if(result!=-1)
		{
			System.out.println("output : " +result);
		}
		else
		{
			System.out.println(target +" Element is not found");
		}

	}
	
	public static int binarySearch_1(int []a,int target,int lowerIndex,int higherIndex)
	{
		int result =-1;
		while(lowerIndex <= higherIndex)
		{
			int mid =lowerIndex + (higherIndex - lowerIndex)/2;
			
			if(a[mid] == target)
			{
				return mid;
			}
			
			else if(a[mid] > target)
			{
				return binarySearch_1(a, target, lowerIndex, mid -1);
			}
			else
			{
				return binarySearch_1(a, target, mid +1, higherIndex);
			}
		}
		return result;
	}

}
