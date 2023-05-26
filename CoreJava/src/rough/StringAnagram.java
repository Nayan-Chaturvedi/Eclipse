package rough;

public class StringAnagram 
{
	public static void main(String[] args)
	{
		String s1="Nitin Chaturvedi";
		String s2="";
		
		String s3[]=s1.split(" ");
		
		for (String string : s3) 
		{
			for(int i=string.length()-1; i>=0; i--)
			{
				s2+=s3[i];
			}
		}
		System.out.println(s2);
	}
	
}
