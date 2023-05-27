package searchingAlgo;

import java.util.Scanner;

public class AssgnSoln_NumberSystem_3 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		
		int num =sc.nextInt();
		
		if((num & 1 )== 1)
		{
			System.out.println("given number is odd");
		}
		else
		{
			System.out.println("Given number is even");
		}

	}

}
