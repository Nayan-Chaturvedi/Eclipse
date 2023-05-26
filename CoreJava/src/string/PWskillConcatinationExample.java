package string;

class AssisPW
{
	void pw1_()
	{
		String s1=new String("Sachin");
		s1.concat("tendulkar");
		s1+="IND";
		String s2=s1.concat("MI");
		System.out.println(s1);
		System.out.println(s2);
		
		
		System.out.println("\n");
		
		String s=new String("Sachin");
		s.concat("tendulkar");
		s=s.concat("IND");
		s="sachinetendulkar";
		System.out.println(s);
		System.out.println(s.substring(2,4));
	}
}

public class PWskillConcatinationExample {

	public static void main(String[] args) 
	{
		AssisPW a =new AssisPW();
		a.pw1_();

	}

}
