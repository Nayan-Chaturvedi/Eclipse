package rough;

import java.util.Arrays;

public class SelectionSort_3 {

	public static void main(String[] args) 
	{
		int a[] = {21,1,23,4,66,7,76,56,80,98,88};
		
		selectionSort(a);

	}
	
	public static void selectionSort(int[] a)
	{
		
		for (int i = 0; i < a.length; i++) 
		{
			int min_Index =i;
			
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min_Index] > a[j])
				{
					min_Index = j;
				}
			}
			if(i!=min_Index)
			{
				int temp =a[i];
				a[i]=a[min_Index];
				a[min_Index] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
