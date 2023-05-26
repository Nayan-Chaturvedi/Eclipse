package string;

public class ProgramReversingStringCase2 
{
	public static void main(String[] args) 
	{
		String s1 ="Nayan Chaturvedi";
		String s2 ="";
		
		String s3[] = s1.split(" ");
		
		for(int i =s3.length-1; i>=0; i--)
		{
			s2 =s2 + s3[i] + " ";
		}
		System.out.println("Before = " +s1);
		System.out.println("After = " + s2);
	}
}
