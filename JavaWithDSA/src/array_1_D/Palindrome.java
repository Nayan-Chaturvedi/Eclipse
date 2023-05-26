package array_1_D;

//Time complexity = 0(n) {use loop}
//Space complexity 0(1) {no use extra loop}

public class Palindrome 
{

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,3,2,1};
		boolean flag=true;
		
		for (int i = 0; i < a.length/2; i++) 
		{
			if(a[i]!=a[a.length-i-1])
			{
				flag=false;
				System.out.println("Not an Palindrome");
				break;
			}
			
		}
		if(flag == true)
		{
			System.out.println("It's Palindrome");
		}
		
	}

}
