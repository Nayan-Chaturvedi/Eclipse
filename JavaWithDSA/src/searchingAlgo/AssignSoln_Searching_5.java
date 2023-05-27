package searchingAlgo;

import java.util.Scanner;

public class AssignSoln_Searching_5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Square Root");
		int squareRoot = sc.nextInt();
		
		int x =squareRootFind(squareRoot);
		
		if(x!=-1)
		{
			System.out.println(squareRoot + " is a perfect sqaure root of " + x);
		}
		else
		{
			System.out.println(squareRoot + " is not a perfect sqaure root");
		}
	}
	
	public static int squareRootFind(int squareRoot)
	{
		int lower_Index =0;
		int higher_Index = squareRoot/2;
		int result = -1;
		
		while(lower_Index <=higher_Index)
		{
			int mid = lower_Index +( higher_Index -lower_Index)/2;
			int value =mid*mid;
			
			if(value == squareRoot)
			{
				return mid;
			}
			else if(value > squareRoot)
			{
				higher_Index = mid -1;
			}
			else
			{
				lower_Index =mid +1;
			}
		}
		return result;
		
		
	}

}
