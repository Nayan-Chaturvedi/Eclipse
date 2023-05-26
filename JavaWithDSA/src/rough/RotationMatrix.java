package rough;

public class RotationMatrix 
{
	public static void rotatedMatrix(int b[][])
	{
		int m=b.length;
		int n=b[0].length;
		
		for (int i = 0; i <m; i++)
		{
			for (int j = i; j < b.length; j++)
			{
				int temp = b[i][j];
				b[i][j]=b[j][i];
				b[j][i]=temp;
			}
		}
		
		for (int i = 0; i < b.length; i++) 
		{
			int leftIndex =0;
			int rightIndex =n-1;
			
			while(leftIndex < rightIndex)
			{
			int temp = b[i][leftIndex];
			b[i][leftIndex]=b[i][rightIndex];
			b[i][rightIndex]=temp;
			
			leftIndex++;
			rightIndex--;
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[][] = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}
				};
		
		rotatedMatrix(a);
		
		for (int[] is : a) 
		{
			for (int i : is) 
			{
				System.out.print(i + " ");
			}
			System.out.println();

		}
		
			
	}
}
