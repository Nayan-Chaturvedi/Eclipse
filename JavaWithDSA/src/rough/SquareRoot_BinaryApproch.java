package rough;

import java.util.Scanner;

public class SquareRoot_BinaryApproch 
{
	public static int squareRootFind(int squareRoot)
	{
		int lowerIndex = 0;
		int higherIndex = squareRoot;
		int result = -1;
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + ( higherIndex - lowerIndex)/2;
			int value = mid * mid;
			
			if(value == squareRoot)
			{
				return mid;
			}
			
			else if(value > squareRoot)
			{
				higherIndex = mid-1;
			}
			else
			{
				result = mid;
				lowerIndex = mid + 1;
			}
				
		}
		return result;
	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Square Root you have find");
		int squareRoot = sc.nextInt();
		
		int result = squareRootFind(squareRoot);
		
		System.out.println("Square root is : " + result);

	}

}
