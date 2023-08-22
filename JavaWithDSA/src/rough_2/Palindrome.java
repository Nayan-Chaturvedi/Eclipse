package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size");
		int size = sc.nextInt();
		
		int num[]= new int[size];
		
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter an element at " + i+ " index");
			num[i] =sc.nextInt();
		}
		
		System.out.println("You enter is " + Arrays.toString(num));
		
		palindrome(num);

	}
	
	public static void palindrome(int []num)
	{
		boolean flag = false;
		int startingIndex = 0;
		int endingInddex = num.length - 1;
		
		for(int i = 0; i < endingInddex/2; i++)
		{
			if(num[i] == num[endingInddex - i])
			{
				flag = true;
			}
			else
			{
				flag = false;
			}
		}
		
		if(flag	!= false)
		{
			System.out.println("It's Palindrome");
		}
		else
		{
			System.out.println("Not an Palindrome");
		}
		
		
	}
}
