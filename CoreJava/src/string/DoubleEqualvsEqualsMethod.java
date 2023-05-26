package string;

class DoubleEqualvsEqual
{
	void camp()
	{
	String s1="PWskill";
	String s2=new String("PWskill");
	
	System.out.println("Double equals to (Refrence check,s1==s2) = " + (s1==s2));
	System.out.println("compare method = " +s1.equals(s2));
	}
	
	
}

public class DoubleEqualvsEqualsMethod {

	public static void main(String[] args)
	{
		DoubleEqualvsEqual d=new DoubleEqualvsEqual();
		d.camp();
		

	}

}
