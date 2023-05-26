package string;

public class ProgramStringPalindrom 
{
	public static void main(String[] args) 
	{
		String s1= "Nayan";
		String s2 ="";
		
		for(int i =s1.length()-1; i>=0; i--)
		{
			s2 =s2+s1.charAt(i);
		}
		System.out.println(s2);
		
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("It's Palindrome");
		}
		else
		{
			System.out.println("Given Sring not a palindrome");
		}
	}
}
