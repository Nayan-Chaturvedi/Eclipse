package array;

class calc
{
	public int add(int b[])
	{
		int result =0;
		for (int i : b) 
		{
			result =result+ i;
		}
		return result;
	}
}

public class Anonymous_Array {

	public static void main(String[] args) 
	{
		calc c=new calc();
	
		int result =c.add(new int[]{10,20,30,40});
		System.out.println(result);

	}

}
