package patternProg;

public class Cross {

	public static void main(String[] args) 
	{
		int n=25;
		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				if(i==j || i+j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		

	}

}
