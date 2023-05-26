package rough;

public class Palindrome_1 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,2,1};
		boolean flag=true;
		
		
		for (int i = 0; i < a.length/2; i++) 
		{
			if(a[i]!=a[a.length-i-1])
			{
				System.out.println("Not an Palindrome");
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("It's Palindrome");
		}

	}

}
