package recursion;

import java.util.Scanner;

public class StairsCaseProblem {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Stairs");
		int stairs =sc.nextInt();
		
		int result = stairsFinding(stairs+1);
		
		System.out.println("The number of ways is : " +result);

	}
	
	public static int stairsFinding(int stairs)
	{
		int result =0;
		
		if(stairs <=1)
		{
			return stairs;
		}
		else
		{
			result = stairsFinding(stairs-1) + stairsFinding(stairs-2);
		}
		
		return result;
	}

}
