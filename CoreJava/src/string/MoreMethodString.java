package string;

import java.lang.*;

class MoreMethod
{
	void method1()
	{
		String s1 ="PWskill";
		String s2="PWSKILL";

		System.out.println("Equal Ignorecase -> compare content"
				+ "no matter content in Uppercase or Lowercase \t =" +s1.equalsIgnoreCase(s2));
		
		System.out.println("\n ");
		System.out.println("\t CONCATINATION OF TWO STRING");
		
		String s3="app";
		
		System.out.println("1st method = "+ s1 + " "+ s3);
		
		System.out.println("\t 2nd method");
		String s4=s1.concat(s3);
		System.out.println(s4);
		
		System.out.println("\t 3rd Method");
		
		String s5=new String("Nayan");
		s5=s5.concat(" Chaturvedi");
		System.out.println(s5);
		
		String s6="\t PW" +100+99;
		System.out.println(s6);
		
	}

}

public class MoreMethodString {

	public static void main(String[] args) {
		MoreMethod mm=new MoreMethod();
		mm.method1();

	}

}
