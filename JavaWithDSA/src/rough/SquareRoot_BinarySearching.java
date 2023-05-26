package rough;

import java.util.Scanner;

public class SquareRoot_BinarySearching {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println(" Enter an square root ");
		int squareRoot = sc.nextInt();
		
		int[] a=new int[squareRoot];

		
		int result =findSquareRoot(a,squareRoot);
		
		System.out.println("Root is : " + result);
	}
	
	public static int findSquareRoot(int[] a, int squareRoot)
	{
		int lowerIndex =0;
		int higherIndex = a.length-1;
		int result =0;
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + (higherIndex - lowerIndex)/2;
			int value = mid*mid;
			
			if(value == squareRoot)
			{
				return mid;
			}
			else if(value < squareRoot)
			{
				result = mid;
				lowerIndex = mid +1;
			}
			else
			{
				higherIndex = mid -1;
			}
		}
		return result;
	}

}
