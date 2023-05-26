package rough;

import java.util.Arrays;

public class PangramStringProgram__1 {

	public static void main(String[] args) 
	{
		boolean flag =true;
		String s1="The quick brown fox jumps over the lazy dog";
		String s2="";
		
		s1=s1.replace(" ", "");
		s1=s1.toLowerCase();
		
		char []c=s1.toCharArray();
		
		int a[]=new int[26];
		
		for(int i=0; i<c.length; i++)
		{
			a[c[i]-97]++;
		}
		
		for(int i=0;i<a.length; i++)
		{
			if(a[i]==0)
			{
				System.out.println("It's not Pangram");
				flag=false;
			}
		}
		if(flag==true)
		{
		System.out.println("It's pangram");
		}
		
	}

}
