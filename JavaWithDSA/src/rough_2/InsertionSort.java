package rough_2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {21,1,2,32,25,90,56,64,2};
		
		
		for (int i = 1; i < a.length; i++)
		{
			int j= i;
			
			while(j>0 && a[j] <a[j-1])
			{
				int temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
				
				j--;
			}
			
		}
		
		System.out.println(Arrays.toString(a));
	}

}
