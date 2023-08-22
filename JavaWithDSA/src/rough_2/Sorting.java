package rough_2;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {21,1,34,2,67,76,43,20,15};
		
		for (int i = 0; i < a.length; i++) {
			
			int min = i;
			
			for (int j = i+1; j < a.length; j++)
			{
				if(a[j] < a[min])
				{
					int temp =j;
					j= min;
					min = temp;
					
				}
			}
			
			if(i!=min)
			{
				int temp = a[i];
				a[i] =a[min];
				a[min] =temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
