package mutableString;

public class FinalVSMutable {

	public static void main(String[] args)
	{
		final StringBuffer sb=new StringBuffer("Virat");
		sb.append("kohli");
		
		// sb=new StringBuffer("Sahin");
		
		System.out.println(sb);
	}

}
