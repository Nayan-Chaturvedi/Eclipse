package recursion;

import java.util.Scanner;

public class BalncedParanthesis 
{
	public static void print(int n, int openCount,int closeCount, String ans)
	{
		if(openCount == n && closeCount ==n )
		{
			System.out.println(ans + " ");
			return;
		}
		if(openCount < n)
		{
			print(n, openCount +1, closeCount, ans + "(");
		}
		if(openCount > closeCount)
		{
			print(n, openCount, closeCount + 1, ans +")");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an digit");
		int n=sc.nextInt();
		
		String ans="";
		int openCount =0;
		int closeCount=0;
		
		print(n, openCount, closeCount, ans);


	}

}
