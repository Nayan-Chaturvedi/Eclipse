package searchingAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class AssgnSoln_NumberSystem_5 {

	public static void main(String[] args)
	{

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the number of element you want to store :");
		int num = sc.nextInt();
		
		int a[] = new int[10];
		
		for (int i = 0; i < num; i++) 
		{
			System.out.println("Enter an number at index : " +i);
			a[i]=sc.nextInt();
		}
		
		
		System.out.println("The odd occuring element is : " + findOddOccuring(a));
	}
	
	public static int findOddOccuring(int []a)
	{
		int xor=0;
		
		for(int i : a)
		{
			xor = xor ^ i;
		}
		return xor;
	}

}
