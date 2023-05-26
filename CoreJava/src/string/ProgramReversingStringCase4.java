package string;

public class ProgramReversingStringCase4 {

	public static void main(String[] args) {
		String s6 = "Pankaj Mosha";
		String s7 ="";
		
		String s8[]= s6.split(" ");
		
		for (String s9 : s8)
		{
			for(int i=s9.length()-1; i>=0; i--)
			{
				s7= s7+s9.charAt(i) ;
			}
			System.out.println("Given String is = " + s6);
			System.out.println("After reversing = " + s7);
		}

	}

}
