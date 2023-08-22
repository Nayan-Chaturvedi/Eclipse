package rough_2;

import java.util.Scanner;

public class NumbersOf1BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size of an Array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter an Element at Idex " + i);
			arr[i] = sc.nextInt();
		}
		
		numberFinds(arr);
	}
	
	public static void numberFinds(int []arr)
	{
		int lowerIndex = 0;
		int higherIndex = arr.length-1;
		int temp =0;
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + ( higherIndex - lowerIndex)/2;
			
			if(arr[mid] == 1)
			{
				temp = mid;
				higherIndex = mid -1;
			}
			else
			{
				lowerIndex = mid +1;
			}
		}
		System.out.println("Numbers of 1's is : " + (arr.length-temp));
	}

}
