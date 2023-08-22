package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumberBrutal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size of an  element");
		int size = sc.nextInt();
		
		int a[]=new int[size];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter an element at index " + i);
			a[i]=sc.nextInt();
		}
		
		System.out.println("You enetr is : " +Arrays.toString(a));
		
		missingNum(a);
	}
	
	public static void missingNum(int a[])
	{
		// First we calculate the sum of N  natural Number
		int n = a.length;
		int sumOfN_NaturalNum = (n+1)*(n+2)/2;
		
		int sum = 0;
		
		for(int i = 0; i< n; i++)
		{
			sum+=a[i];
		}
		
		System.out.println("Missing num is : " +(sumOfN_NaturalNum - sum));
	}

}
