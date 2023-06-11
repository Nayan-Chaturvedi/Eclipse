package backtracking;

import java.util.Scanner;

public class TilesProblem {
	
	public static int countTiles(int n)
	{
		if(n<=3)
		{
			return n;
		}
		
		return countTiles(n-1) +(n-2); 
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an value of (2*n) n :");
		int n=sc.nextInt();
		
		System.out.println("Tiles : " + countTiles(n));
	}

}
