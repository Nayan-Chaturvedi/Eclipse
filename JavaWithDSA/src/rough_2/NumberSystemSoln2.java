package rough_2;

import java.util.Scanner;

public class NumberSystemSoln2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an number");
		int num = sc.nextInt();
		
		numsCheck(num);
	}
	
	public static void numsCheck(int num)
	{
		int count =0;
		
		while(num>0)
		{
			count = count +(num&1);
			num >>=1;
			
			
		}
		
		System.out.println("Number of 1's is : " + count);
	}

}
