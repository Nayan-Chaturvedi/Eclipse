package rough;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch_1 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Size");
		int size= sc.nextInt();
		
		int a[]= new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
			
		}
		System.out.println();
		
		System.out.println("You enter --\n" + Arrays.toString(a));
		
		System.out.println();
		
		System.out.println("Enter an target element");
		int target = sc.nextInt();
		
		int result =binarySearch(a,target);
		
		if(result!=-1)
		{
			System.out.println("Element found at Index : " + (result+1));
		}
		
		else
		{
			System.out.println("Element not present");
		}
	}
	
	public static int binarySearch(int[] a , int target)
	{
		int lowerIndex=0;
		int higherIndex = a.length-1;
		
		while(lowerIndex <= higherIndex)
		{
			
			int mid = lowerIndex + (higherIndex - lowerIndex)/2;
			
			if(a[mid]==target)
			{
				return mid;
			}
			else if(a[mid] > target)
			{
				higherIndex = mid-1;
			}
			else
			{
				lowerIndex =mid +1;
			}
		}
		return -1;
	}

}
