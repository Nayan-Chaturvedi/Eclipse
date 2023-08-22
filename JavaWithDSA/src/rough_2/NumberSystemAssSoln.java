package rough_2;

import java.util.Scanner;

public class NumberSystemAssSoln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Number");
		int num =sc.nextInt();
		
		if((num & 1) == 1)
		{
			System.out.println("Given num " + num + " odd");
		}
		else
		{
			System.out.println("Given num " + num + " even");
		}
	}

}
