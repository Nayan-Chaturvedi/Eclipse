package extra_;

import java.util.Scanner;

public class FabonnaciSeries
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number");
		int num=sc.nextInt();
		
		fabonacciSeries(num);
	}
	
	public static void fabonacciSeries(int num)
	{
		int firstNum=0;
		int secondNum=1;
		int temp=0;
		
			//		USING WHILE LOOP

		
//		while(firstNum<num)
//		{
//			System.out.print(firstNum+" ");
//			
//			temp=firstNum+secondNum;
//			firstNum=secondNum;
//			secondNum=temp;
//		}
		
			// 		USING FOR LOOP
				
		
		System.out.println("Using for loop");
		for(int i=0; i<num; i++)
		{
			System.out.print(firstNum+" ");
			
			temp=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=temp;
			
			if(firstNum>num)
			{
				break;
			}
			  
			 
		}
		 
	}
}