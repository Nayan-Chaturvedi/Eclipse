package rough;

public class Matrix_Rotation 
{
	public static void rotationMatrix(int a[][])
	{
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i; j < a[0].length; j++) 
			{
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i] = temp;
			}
		}
		
		int n=0;
		int m= a[0].length-1;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a[0].length; j++)
			{
				int temp =a[i][n];
				a[i][n] = a[i][m];
				a[i][m] = temp;
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
	}
	public static void main(String[] args) 
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		rotationMatrix(a);
					
				
		}
	}

