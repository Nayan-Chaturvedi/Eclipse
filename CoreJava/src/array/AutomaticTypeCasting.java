package array;

public class AutomaticTypeCasting {

	public static void main(String[] args) 
	{
		byte b=2;
			int[] nums=new int[b];		//Automatic type casting
			nums[0]=10;
			nums[1]=20;
				
			for(int a:nums)
			{
				System.out.println(a);
			}
		
	}

}
