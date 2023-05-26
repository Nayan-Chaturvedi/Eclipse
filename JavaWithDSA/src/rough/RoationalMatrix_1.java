package rough;

public class RoationalMatrix_1 {

	public static void main(String[] args) 
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++) 
			{
				int temp=a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) 
		{
			int n=0;
			int m=a[0].length-1;
			
			int temp=a[i][m];
			a[i][m]=a[i][n];
			a[i][n]=temp;
		}
		
		
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		
		}

	

}
