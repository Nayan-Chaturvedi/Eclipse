package string;

public class ProgramStrinPangram {

	public static void main(String[] args) {
		
		boolean flag=true;
		String s1="THE QUICK BROWN FOx JUMpS OVER LAZY DOg";
		
		s1=s1.replace(" ", ""); // space ko replace kar diya --> "" 
		s1=s1.toUpperCase(); // lower case bna di string 
		
		char ch[]=s1.toCharArray();
		int a[]=new int[26];
		
		for(int i=0; i<ch.length; i++)
		{
			a[ch[i]-65]++;
		}
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]==0)
			{
				System.out.println("It's not pangram");
				flag=false;
			}
			
		}
		if(flag==true)
		{
			System.out.println("It's palingram");
		}

	}

}
