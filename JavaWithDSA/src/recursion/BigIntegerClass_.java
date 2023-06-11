package recursion;
import java.math.BigInteger;
//Class -Biginteger ye ek class hai 

//agar 2^64 =ka jo output hai vo na long handle kar paega na double
//to ush case me bigInteger ka use karte hai
import java.util.Scanner;

public class BigIntegerClass_ 
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A");
		BigInteger a=sc.nextBigInteger();
		
		System.out.println("Enter B");
		int b= sc.nextInt();
		
		BigInteger result = powerFind(a,b);
		
		System.out.println("Output : " +result);
	}
	
	public static BigInteger powerFind(BigInteger a,int b)
	{
		BigInteger result,finalResult;
		
		if(b==1)
		{
			return a;
		}
		
		else
		{
			result = powerFind(a,b/2);
			finalResult = result.multiply(result);
			
			if(b%2==0)
			{
				return finalResult;
			}
			else
			{
				return a.multiply(finalResult);
			}
		}
	}
	
	
}

			
			