package rough;

public class Duplicate_1 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,5};
		boolean flag=true;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate number is : " + a[i]);
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Not duplicate number found");
		}
	}
}
