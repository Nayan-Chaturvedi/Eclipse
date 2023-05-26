package rough;

import java.util.Scanner;

public class SquareRoot_2 {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an square");
		int square_Root= sc.nextInt();
		
		int result =squareRoot(square_Root);
		System.out.println("Square root of : " + result);

	}
	
	public static int squareRoot(int square_Root)
	{
		int lower_Index =0;
		int higher_Index = square_Root;
		int result =-1;
		
		while(lower_Index <= higher_Index)
		{
			int mid = lower_Index +(higher_Index - lower_Index)/2;
			int value = mid * mid;
			
			if(value == square_Root)
			{
				return mid;
			}
			
			else if(value > square_Root)
			{
				higher_Index = mid -1;
			}
			else
			{
				result = mid;
				lower_Index = mid +1;
			}
		}
		return result;
		
	}

}
