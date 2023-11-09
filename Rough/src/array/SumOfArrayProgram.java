package array;

class SumOfArray_1
{
	
	void sum()
	{
		int a[]= {1,2,3,4,5};
		int sum=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			sum=sum + a[i];
		}
		System.out.println("Sum is = "+ sum);
	}
}

public class SumOfArrayProgram {

	public static void main(String[] args) 
	{
		SumOfArray_1 s= new SumOfArray_1();
		s.sum();

	}

}
