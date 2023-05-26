package rough;

public class ProgramReversingStringCase3EnhanceForLoop 
{
	public static void main(String[] args) {
		
		String s1= "Malti Chaturvedi";
		String s2 ="";
		
		String s3[]=s1.split(" ");
		
		
		for(int i =s3.length-1; i>=0; i--)
		{
			s2 = s2+ s3[i]+ " ";
		}
		
		System.out.println(s2);
		
		String s4 ="Nitin";
		String s5= "";
		
		for(int i= s4.length()-1; i>=0; i--)
		{
			s5= s5 + s4.charAt(i);
		}
		
		System.out.println(s5);
		
		String s6 = "Pankaj Mosha";
		String s7 ="";
		
		String s9[]= s6.split(" ");
		
		for (String s8 : s9)
		{
			for(int i=s8.length()-1; i>=0; i--)
			{
				s7= s7+s8.charAt(i) ;
			}
			System.out.println(s7);
		}
	}
}
