package patternProg;

import java.util.Scanner;

public class N_Pattern {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size");
		int n= sc.nextInt();
		
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(j==0 && i>0  || i==j || j==(n-1) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
