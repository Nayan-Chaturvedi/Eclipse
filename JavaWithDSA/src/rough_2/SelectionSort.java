package rough_2;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {21,2,32,1,45,32,13};
		
		for (int i = 0; i < a.length; i++) {
			
			int min_Index = i;
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j] < a[min_Index])
				{
					int temp =j;
					j= min_Index;
					min_Index=temp;
				}
			}
			
			if(i!=min_Index)
			{
				int temp =a[i];
				a[i] =a[min_Index];
				a[min_Index] =temp;
			}
		}
		
		System.out.println(Arrays.toString(a));
	}

}
