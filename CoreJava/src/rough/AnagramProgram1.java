package rough;

import java.util.Arrays;

public class AnagramProgram1 
{
	public static void main(String[] args)
	{
		String s1="School Master";
		String s2="The ClassRooms";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.equals(c1, c2))
		{
			System.out.println("It's pangram");
		}
		else
		{
			System.out.println("Not an pangram");
		}
	}
}
