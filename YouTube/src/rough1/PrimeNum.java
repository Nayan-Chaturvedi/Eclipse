package rough1;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Limit");
		int limit = sc.nextInt();
		
		for(int i= 1; i <limit; i++)
		{
			boolean flag = true;
			
			for(int j= 2; j< i; j++)
			{
				if(i%j ==0)
				{
					flag =false;
					
					break ;
				}
			}
			if(flag)
			{
				System.out.print(i + " ");	
			}
		}
	}

}
