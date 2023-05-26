package rough;

import java.util.Arrays;

public class BubbleSort_3 
{

	public static void main(String[] args)
	{
		int a[] = {20,10,2,3,5,80,82,2};
		
		bubbleSort(a);

	}
	
	public static void bubbleSort(int[] a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			boolean swap =false;
			
			for (int j = 0; j < a.length-i-1; j++) 
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]= a[j+1];
					a[j+1]= temp;
					
					swap =true;
				}
			}
			if(!swap)
			{
				
				break;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
