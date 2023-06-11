package recursion;

import java.util.Scanner;

public class PrintPath 
{
	public static void printPath(int currentPostion , int destination ,String path)
	{
		if(currentPostion == destination)
		{
			System.out.println(path);
			return;
		}
		if(currentPostion> destination)
		{
			return;
		}
		printPath(currentPostion +1, destination, path +1);
		printPath(currentPostion +2, destination, path +2);
		printPath(currentPostion +3, destination, path +3);
		printPath(currentPostion +4, destination, path +4);
		printPath(currentPostion +5, destination, path +5);
		printPath(currentPostion +6, destination, path +6);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Destination");
		int destination=sc.nextInt();
		
		int currentPostion=0;
		String path="";
		
		printPath(currentPostion, destination, path);
	}

}
