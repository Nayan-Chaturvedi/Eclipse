package extra_;

import java.util.Scanner;

public class DisplayStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an Limit");
		int limit = sc.nextInt();
		
		for(int i =1; i<=limit; i++)
		{
			int result=StrongNum(i);
		
			if(result == i)
			{
				System.out.println(i);
			}
		}
		
		
	
	}
	
	public static int StrongNum(int limit)
	{
		int sum=0;
		
		while(limit>0)
		{
			int temp = limit % 10;
			
			int fact=factorial(temp);
			
			sum += fact;
			
			limit /= 10;
		}
		return sum;
	}
	
	public static int factorial(int temp)
	{
		int fact =1;
		
		for(int i= 1; i<=temp; i++)
		{
			fact *=i;
		}
		return fact;
			
		
	}

}
