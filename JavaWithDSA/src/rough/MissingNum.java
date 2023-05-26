package rough;

public class MissingNum 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,6};
		
		int n= a.length;
		
		int sum=0;
		
		for (int i = 0; i < a.length; i++)
		{
			sum+=a[i];
		}
		
		int sumOfNaturalNumber = ((n+1)*(n+2))/2;
		
		System.out.println("Missing number = " + (sumOfNaturalNumber - sum));
	}
}
