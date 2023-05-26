package array_1_D;

public class AssignmentSolution_Ques_1 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		int i=0,sum=0;
		
		while(i<a.length)
		{
			sum+=a[i];
			i+=2;
		}
		
		System.out.println("Sum is : " + sum);

	}

}
