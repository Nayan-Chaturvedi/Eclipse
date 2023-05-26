package rough;

import java.util.Arrays;

public class InsertionSort_3 
{

	public static void main(String[] args) 
	{
		int a[] = {21,1,23,43,2,54,89,55,4};
		
		insertionSort(a);

	}
	
	public static void insertionSort(int []a)
	{
		for (int i = 1; i < a.length; i++)
		{
			int j = i;
			
			
			while(j>0 && a[j]<a[j-1])
			{
				int temp =a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
				
				j--;
			}
		}
		System.out.println(Arrays.toString(a));
	}


}
