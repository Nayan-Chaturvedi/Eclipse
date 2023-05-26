package array_1_D;

public class MissingNumber 
{
	public static void main(String[] args) 
	{
		int []a= {1,2,4,5,6};
		
		int n=a.length;
		
		// Sum of natural number in an array
		
		int sum_natural_number=((n+1)*(n+2))/2;
		// ((n+1)*(n+2))/2 explain
		// sum of natural number mean ye hai ki yaha 5 element hai
		 // 5+4+3+2+1 =15 par yaha hamne missing element ko bhi add kiya hai
		// ish karan se (n+1)(n+2) aaya hai
		// standard formula = n(n+1)/2 hai
		int sum=0;
		
		for (int i = 0; i <n; i++) 
		{
			sum+=a[i];
		}
		
		int missing_element =0;
		
		missing_element = sum_natural_number - sum;
		
		System.out.println("Missing element is = " + missing_element);
		
	}
}
