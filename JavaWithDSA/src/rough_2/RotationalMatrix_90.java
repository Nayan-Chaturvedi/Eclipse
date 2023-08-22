package rough_2;

import java.util.Iterator;



public class RotationalMatrix_90 {
	
	public static void main(String[] args) {
		
		int a[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
		
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		for (int i = 0; i < a.length; i++) {
			
			int leftIndex =0;
			int rightIndex = a.length-1;
			
			while( leftIndex < rightIndex)
			{
				int temp = a[i][leftIndex];
				a[i][leftIndex]= a[i][rightIndex];
				a[i][rightIndex] = temp;
				
				leftIndex++;
				rightIndex--;
			}
		}
		
		System.out.println();
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		for(int i =a.length-1; i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		System.out.println();
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		for(int i= 0; i<a.length; i++)
		{
			
			int upperIndex =0;
			int downIndex =a.length-1;
			
			while(upperIndex < downIndex)
			{
				int temp = a[upperIndex][i];
				a[upperIndex][i]= a[downIndex][i];
				a[downIndex][i]=temp;
				
				upperIndex++;
				downIndex--;
			}
		 	
		}
		System.out.println();
		for (int[] is : a) {
			for (int is2 : is) {
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		
	}
}