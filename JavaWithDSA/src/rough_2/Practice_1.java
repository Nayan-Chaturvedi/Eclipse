package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Check number odd / Even");
		
		int n=5;
		
		if((n&1) == 1)
		{
			System.out.println("Given number is odd");
		}
		else
		{
			System.out.println("Given number is even");
		}
		
		System.out.println(" To check number of 1's");
		
		int count =0;
		
		while(n>0)
		{
			count+=(n&1);
			n>>=1;
		}
		
		System.out.println(count);
	}
	

}
