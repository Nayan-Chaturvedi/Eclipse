package recursion;

import java.util.Scanner;

public class FindDigitMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		int n=sc.nextInt();
		
		System.out.println("Enter times of Multiple");
		int k=sc.nextInt();
		
		multipleFind(n,k);
	}
	
	public static void multipleFind(int n,int k)
	{
		if(k==1)
		{
			System.out.println(n);
			return;
		}
		else
		{
			 multipleFind(n, k-1);
			System.out.println(n*k);
		}
	}

}
