package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Number ");
		int num = sc.nextInt();
		
	int result=	squareRoot(num);
	System.out.println("Square root is : " + result);
	}

	public static int squareRoot(int n)
	{
		int  lowerIndex =0;
		int higherIndex = n;
		
		int temp =-1;
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + (higherIndex -lowerIndex)/2;
			int square = mid * mid;
			
			if(square == n)
			{
				return mid;
			}
			else if( square < n)
			{
				temp = mid;
				lowerIndex = mid +1;
			}
			else
			{
				higherIndex = mid -1;
			}
		}
		return temp;
	}
}
