package rough;

public class RotationalMatrix_1 
{
	public static void rotationalMatrix(int f[][])
	{
		for (int i = 0; i < f.length; i++) 
		{
			for (int j = i; j < f.length; j++) 
			{
				int temp =f[i][j];
				f[i][j]=f[j][i];
				f[j][i]=temp;
			}
		}
		
		for (int i = 0; i < f.length; i++) 
		{
			int n=0;
			int m=f.length-1;
			
			while(n<m)
			{
				int temp=f[i][n];
				f[i][n]=f[i][m];
				f[i][m]=temp;
				
				n++;
				m--;
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		rotationalMatrix(a);
		
		for (int[] is : a)
		{
			for (int is2 : is) 
			{
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
	}
}

