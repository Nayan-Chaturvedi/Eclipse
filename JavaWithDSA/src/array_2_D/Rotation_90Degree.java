package array_2_D;

import java.util.Arrays;

public class Rotation_90Degree {
	
	public static void rotatedMatrix(int b[][])
	{
		// step 1: transpose 2-d Array
		
		int m=b.length; 	// number of rows
		int n=b[0].length; //number of coloumn
		
		for (int i = 0; i < m; i++) 
		{
			for (int j = i; j <m; j++) 
			{
				int temp= b[i][j];
				b[i][j]= b[j][i];
				b[j][i]=temp;
			}
		}
		//step 2 :Swap
		for (int i = 0; i < m; i++) 
		{
			int leftIndex = 0;
			int rightIndex =n-1;
			
			while(leftIndex < rightIndex)
			{
				int temp =b[i][leftIndex];
				b[i][leftIndex] =b[i][rightIndex];
				b[i][rightIndex] =temp;
				
				leftIndex ++;
				rightIndex--;
			}
		}
			
		}
	

	public static void main(String[] args)
	{
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		rotatedMatrix(a);
		
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		

	}

}
