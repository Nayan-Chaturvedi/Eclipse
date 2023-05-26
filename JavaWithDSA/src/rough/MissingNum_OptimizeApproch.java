package rough;

public class MissingNum_OptimizeApproch
{
	public static void missingNum(int a[])
	{
		int n=a.length;
		int sum=1;
		
		for (int i = 2; i <=(n+1); i++) 
		{
			sum+=i;
			sum-=a[i-2];
		}
		
		System.out.println(sum);
		
//		for(int i=0; i<n; i++)
//		{
//			sum-a[i];
//		}
	}

	public static void main(String[] args)
	{
		int a[]= {1,3,4,5};
		
		missingNum(a);

	}

}
