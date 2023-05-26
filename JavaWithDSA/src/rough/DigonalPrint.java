package rough;

public class DigonalPrint
{

	public static void main(String[] args) 
	{
		int a[][]=
			{
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,16}
			};
		
		int s = a[0].length -1;
		
		for (int i = 0; i < a.length; i++) 
		{
			
			System.out.print("First digonal : "  + a[i][i] + " ");
			
			System.out.println();
			
			if(i!=a.length-i-1)
			{
				System.out.print("second dignonal : " +a[i][a.length-i-1]);
				System.out.println();
			}
		}

	}

}
