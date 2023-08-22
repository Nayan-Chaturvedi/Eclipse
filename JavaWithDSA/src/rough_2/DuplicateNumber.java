package rough_2;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateNumber {

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
		
		duplicateNum(a);
	}
	public static void duplicateNum(int[] a)
	{
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i] == a[j])
				{
					System.out.println("Duplicate Num is : " + a[i]);
					break;
				}
				
			}
			
		}
	}

}
