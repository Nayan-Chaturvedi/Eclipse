package recursion;

import java.util.Scanner;

public class MazeProblem 
{
	public static void print(int currentRow, int currentColoumn,int destinationRow,
			 int destinationColoumn,String path)
	{
		if(currentColoumn> destinationColoumn || currentRow > destinationRow)
		{
			return;
		}
		if(currentColoumn == destinationColoumn && currentRow ==destinationRow)
		{
			System.out.println(" " +path);
			return;
		}
		print(currentRow+1, currentColoumn, destinationRow, destinationColoumn, path+"H");
		print(currentRow, currentColoumn+1, destinationRow, destinationColoumn, path+"V");
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter destination row");
		int destinationRow=sc.nextInt();
		
		System.out.println("Enter destination coloumn");
		int destinationColoumn =sc.nextInt();
		
		int currentRow=0;
		int currentColoumn=0;
		
		String path="";
		
		print(currentRow, currentColoumn, destinationRow, destinationColoumn, path);
	}

}
