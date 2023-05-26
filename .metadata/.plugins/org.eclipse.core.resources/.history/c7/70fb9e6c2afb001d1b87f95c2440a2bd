package rough;

import java.util.Arrays;
import java.util.Scanner;

public class FirstOccurance_searchBinary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an size of an Array");
		int size =sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an element at Index " +i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("You Enter --\n" + Arrays.toString(a) +"\n");
		
		System.out.println("Enter an target Element : ");
		int target =sc.nextInt();
		
		int result =FirstOccurance(a,target);
		
		 if(result >-1)
		 {
			 System.out.println("Element present at index : " + (result));
		 }
		 else
		 {
			 System.out.println("Element is not present");
		 }

	}
	
	public static int FirstOccurance(int a[],int target)
	{
		int lowerIndex = 0;
		int higerIndex= a.length-1;
		int result =-1;
		
		while(lowerIndex <= higerIndex)
		{
			int mid = lowerIndex + (higerIndex - lowerIndex)/2;
			
			if(a[mid] == target)
			{
				result = mid;
				higerIndex = mid -1;
			}
			else if(a[mid] < target)
			{
				
				lowerIndex = mid +1;
			}
			else
			{
				higerIndex = mid-1;
			}
		}
		return result;
	}

}
