package rough;

class annonomous_$
{
	int add(int a[])
	{
		int sum=0;
		
		for (int i : a) 
		{
			sum=sum+i;
		}
		return sum;
	}
}
	


public class Anonomous_Array1
{

	public static void main(String[] args) 
	{
		annonomous_$ a=new annonomous_$();
		int result=a.add(new int[]{10,20,30,40});
		System.out.println(result);
	}
}





