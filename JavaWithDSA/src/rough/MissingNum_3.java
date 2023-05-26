package rough;

public class MissingNum_3 
{
	public static int missingNum(int a[])
	{
		int total=1;
		
		for (int i = 2; i < (a.length +1); i++)
		{
			total+=i;
			total-=a[i-2];
		}
		
		return total;
	}
	public static void main(String[] args) 
	{
		
		int a[]= {1,2,3,4,5,6,8};
		
		int result=missingNum(a);
		System.out.println(result);
		
		

	}

}
