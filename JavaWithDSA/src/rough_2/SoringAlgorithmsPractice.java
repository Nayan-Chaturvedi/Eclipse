package rough_2;

import java.util.Arrays;

public class SoringAlgorithmsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 21,2,1,34,5,3,67,8,4,32,1,23,76,5};
		
		for (int i = 0; i < a.length; i++) {
			
			boolean flag = false;
			
			for (int j = 1; j < a.length-i; j++) {
				
				if(a[j] < a[j-1])
				{
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					
					flag = true;
				}
			}
			if(!flag)
			{
				break;
			}
		}
		System.out.println( " Bubble sort : "+Arrays.toString(a));
		
		for (int i = 1; i < a.length; i++) 
		{
			int j = i;
			
			while(j>0 && a[j] < a[j-1])
			{
				int temp = a[j];
				a[j] =a[j-1];
				a[j-1] = temp;
				
				j--;
			}
		}
		
		System.out.println("Insetion sort : " + Arrays.toString(a));
		
		for (int i = 0; i < a.length; i++) 
		{
			int minIndex = i;
			
			for (int j = i+1; j < a.length ; j++)
			{
				if(a[j] < a[minIndex])
				{
					int temp = j;
					j= minIndex;
					minIndex = temp;
							
				}
			}
			if(i!=minIndex)
			{
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
		System.out.println("Selection sort : " +Arrays.toString(a));
	}
	
	

}
