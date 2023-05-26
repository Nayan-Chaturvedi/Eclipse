package string;

public class Immutable_Mutable {

	public static void main(String[] args) 
	{
		String s="123N";
		s.concat("jdbvjfd");
		System.out.println(s);
		
		StringBuilder b=new StringBuilder("g76");
		System.out.println(b);
		System.out.println("\n");
		b.append("String builder concat");
		System.out.println(" "+b);
		
		
		

	}

}
