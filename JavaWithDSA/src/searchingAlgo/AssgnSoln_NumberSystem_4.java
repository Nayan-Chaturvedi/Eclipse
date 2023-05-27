package searchingAlgo;

import java.util.Scanner;

public class AssgnSoln_NumberSystem_4 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int num = sc.nextInt();
		
		int bit = countSetBits(num);
		
		System.out.println("Number of set of bits present : " +bit);
	}
	
	public static int countSetBits(int num)
	{
		int count =0;
		
		while(num >0)
		{
			count = count + (num & 1);
			num= num >>1;
		}
		return count;
	}

}
