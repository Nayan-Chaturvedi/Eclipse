package array;

class demo
{
	int add(int a[])
	{
		int sum=0;
		for (int j = 0; j < a.length; j++)
		{
			sum+=a[j];
		}
		
		return sum;
	}
}

public class Anonomous_Array2 {

	public static void main(String[] args) 
	{
		demo d=new demo();
		int result=d.add(new int[]{10,20,30,40,60});
		int sum=d.add(new int[] {22,33,44,55});
		System.out.println(result);
		System.out.println(sum);
	}

}
