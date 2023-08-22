package string;

public class ConstructorOfString {

	public static void main(String[] args)
	{
		System.out.println("First Constructor");
		
		String s1="Nayan";
		System.out.println("\t "+s1);
		
		System.out.println("Second constructor");
		String s2=new String("second ");
		System.out.println("\t "+ s2);
		
		System.out.println("In char array format . Autoconversion ");
		char c[]= {'p','w'};
		String s3 =new String(c);
		System.out.println("\t "+s3);
		
		byte b[]= {65};
		String s4=new String(b);
		System.out.println(s4);
		
		String s5=new String(); // Empty 
		System.out.println("S5 is " + s5);

		
		
		
				
		
		
	}

}
