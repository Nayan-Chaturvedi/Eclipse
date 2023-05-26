package searchingAlgo;

import java.util.Scanner;

public class SquareRoot_BinarySearch
{
	public static int squareRoot(int m)
	{
		int lowerIndex = 0;
		int higherIndex = m ;
		int result = -1;
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + ( higherIndex - lowerIndex)/2; 
			long var = mid * mid;
			
			if( m == var)
				// perfect Square root
			{
				return mid;
			}
			
			else if( var < m)
			{
				// store the floor value , in case the number is not prefect square root 
				// we can print the floor value
				result = mid;
				lowerIndex = mid +1;
			}
			else
			{
				higherIndex = mid -1;
			}
			
		}
		return  result;
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an number of which you want the square root");
		int m= sc.nextInt();
		
		// function call
		
		int result = squareRoot(m);
		
		System.out.println("Square root of given number is : " +result);
		

	}

}
