package rough;

import java.util.Arrays;

public class AnagramString
{
	public static void main(String[] args)
	{
		String s1= "School Master";
		String s2= "The Classroom"; 
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char c1[]= s1.toCharArray();
		char c2[]= s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("It's Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}
		
		
	}
}
