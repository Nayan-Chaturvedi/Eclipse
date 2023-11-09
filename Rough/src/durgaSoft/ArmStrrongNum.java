package durgaSoft;

import java.security.Signature;

public class ArmStrrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num =153;
		
		if(isArmStrong(num))
		{
			System.out.println("Its,s an ArmStrong");
		}
		else
		{
			System.out.println("Not an ArmStrong");
		}
	}
	
	public static boolean isArmStrong(int num)
	{
		boolean flag = true;
		int sum=0;
		
		int power = powerFinder(num);
		int tempNum = num;
		
		while(num > 0)
		{
			int temp = num % 10;
			int digit= temp;
			
			for(int i=1; i<power; i++)
			{
				temp = temp * digit;
			}
			
			sum += temp;
			
			num = num/10;
				
		}
		if(sum != tempNum)
		{
			flag = false;
		}
		
		return flag;
	}
	
	public static int powerFinder(int num)
	{
		int count = 0;
		while(num > 0)
		{
			int temp = num % 10;
			num = num/10;
			count++;
		}
		return count;
	}

}
