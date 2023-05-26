package array;

class MaximumValueFind
{
	void maxOfArray()
	{
		int a[]= {10,20,30,77,10,22,33,44};
		
		int ans=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]>ans)
			{
				ans=a[i];
			}
			
		}
		System.out.println("Maximum value is = " +ans);
	}
}

public class ProgramMaximumValueOfArray {

	public static void main(String[] args) 
	{
		MaximumValueFind m=new MaximumValueFind();
		m.maxOfArray();

	}

}
