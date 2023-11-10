package extra_;

import java.util.Scanner;

public class DisplayArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Limit");
		int limit = sc.nextInt();
		
		for (int i = 1; i <= limit; i++)
		{
		int iKAi =i;
		
		int count = pawarFind(i);
		
		int result=armStrongNum(count, i);
		
		if(iKAi == result)
		{
			System.out.println(iKAi);
		}
		}
	}
	
	public static int pawarFind(int i)
	{
		int temp =0;
		int count=0;
		
		while(i>0)
		{
			count++;
			temp = i % 10;
			i = i / 10;
		}
		
		return count;
	}
	
	public static int armStrongNum(int count, int i)
	{
		int sum =0;
		
		while(i>0)
		{
			int temp =0;
			
			temp = i % 10;
			int tempKaTemp =temp;
			
			for(int pawar = 1; pawar <count; pawar++)
			{
				temp = temp * tempKaTemp;
			}
			
			sum = sum + temp;
			
			i= i / 10;
		}
		
		return sum;
	}
	
	

}
