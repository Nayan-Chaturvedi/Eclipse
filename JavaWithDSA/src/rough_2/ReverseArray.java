package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

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
		
		reverseNum(num);
	}
	
	public static void reverseNum(int[] num)
	{
		int startingIndex =0;
		int endingIndex = num.length-1;
		
		for(int i =0; i < endingIndex/2; i++)
		{
			int temp = num[endingIndex - i];
			num[endingIndex - i] =num[i];
			num[i] = temp;
					
					
		}
		
		System.out.println("Reverse is : " + Arrays.toString(num));
	}

}
