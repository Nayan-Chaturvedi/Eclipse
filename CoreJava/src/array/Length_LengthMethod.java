package array;

public class Length_LengthMethod {

	public static void main(String[] args) 
	{
		int num[]= {10,20,30};
		
		System.out.println("Array length =" + num.length);
		
		int num2[][]=
			{
					{1,2,3,9}, //1st Array . In 1st array consist of 4 element
					{4,5,6},//2nd Array 
					{7,8,9},
			};
		System.out.println(num2.length);
		System.out.println(num2[0].length); 
		
		String s="Nayan";
		System.out.println(s.length());
		

	}

}
