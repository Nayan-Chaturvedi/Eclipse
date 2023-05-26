package rough;

public class PangramProgramPractice {

	public static void main(String[] args) 
	{
		String s1="T quickh brown fox jumps over lazy dog";
		
		s1=s1.toLowerCase();
		s1=s1.replace(" ", "");
		
		char []c1=s1.toCharArray();
		int a[]=new int[26];
		
		for (int i = 0; i < c1.length; i++) 
		{
			a[c1[i]-97]++;
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]==0)
			{
				System.out.println("It's pangram");
			}
			
		}
		System.out.println("not an pangram");
		
	}

}
