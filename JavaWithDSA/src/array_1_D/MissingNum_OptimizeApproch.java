package array_1_D;

// Modification of OverFlow
public class MissingNum_OptimizeApproch 
{
	public static int missingNum(int []a)
	{
		int sum=1;
		int n=a.length;
		
		for (int i = 2; i < (n+1); i++) 
		{
			sum+=i;		//This formula is a base formula to avoid overflow condition
			sum-=a[i-2];
		}
		
		return sum;
	}
	public static void main(String[] args) 
	{
		int a[]= {2,3,4,5,6};
		
		int n=a.length;
		
		int result =missingNum(a);
		
		System.out.println("Missing number is : " + result);
	}
}
