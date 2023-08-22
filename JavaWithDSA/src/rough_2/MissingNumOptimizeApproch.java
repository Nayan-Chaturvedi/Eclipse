package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumOptimizeApproch {

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
		
		missingNumOptimize(a);
	
	}
	
	public static void missingNumOptimize(int[] a)
	{
		int sum =1;
		
		for (int i = 2; i < (a.length + 1); i++) 
		{
			sum+=i;
			sum-=a[i-2];
		}
		
		System.out.println("Missing num is : " +sum);
	}

}
