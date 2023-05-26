package string;

import java.util.Arrays;

public class ProgramStrinAnagram {
	public static void main(String[] args) {
		
		String s1=" School Master";
		String s2="The ClassRoom";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char s3[]=s1.toCharArray();
		char s4[]=s2.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		
		if(Arrays.equals(s3, s4))
		{
			System.out.println("It's an Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
		
		
		
		
	}

}
