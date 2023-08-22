package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter an Target Element");
		int target = sc.nextInt();
		
		boolean result=numberOfOccurance( target);
		System.out.println("Output : " + result);
	}
	
	public static boolean numberOfOccurance( int target)
	{
		int lowerIndex =0;
		int higherIndex = target-1;;
		int tempLower =0;
		
		
		while(lowerIndex <= higherIndex)
		{
			int mid = lowerIndex + ( higherIndex - lowerIndex)/2;
			int square = mid * mid ;
			if(square< target )
			{
				lowerIndex = mid+1;
			}
			else if( square > target)
			{
				higherIndex = mid-1;
			}
			else
			{
				return true;
			}
		}
		return false;
	}

}
