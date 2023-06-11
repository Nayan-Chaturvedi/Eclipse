package recursion;
 
import java.util.Scanner;

public class A_Power_B_OptimizeApproch {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A");
		int a =sc.nextInt();
		
		System.out.println("Enter B");
		int b=sc.nextInt();
		
		int result =findingPower(a,b);
		
		System.out.println("Output : " +result);

	}
	
	public static int findingPower(int a,int b)
	{
		if(b==1)
		{
			return a;
		}
		else
		{
			int mid =b/2;
			int result =  findingPower(a,mid);
			int finalResult = result * result;
			
			if(b%2 ==0) // Even Case  - Power is Even
			{
				return finalResult;
			}
			else // Odd case --Power is Odd
			{
				return 2* finalResult;
			}
		}
	}

}
