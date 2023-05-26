package mutableString;

public class Example1 
{
	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer("Nayan");
		System.out.println(sb);
		sb.append("Chaturvedi"); // chaturvedi same object me add hoga
		System.out.println(sb);
		
		System.out.println();
		StringBuilder s=new StringBuilder("String builder");
		s.append("Append");
		System.out.println(s);
	}
}
