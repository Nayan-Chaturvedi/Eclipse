package rough_2;

import java.util.Arrays;

public class BubbleSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {21,23,3,4,7,56,12};
		
		
		for(int j =0; j< a.length; j++)
		{
			boolean flag = false;
		
		for (int i = 1; i < a.length -j-1; i++) {
			
			if(a[i] < a[i-1])
			{
				int temp = a[i];
				a[i] = a[i-1];
				a[i-1]= temp;
				
				flag = true; 
			}
		}
		if(!flag)
		{
			break;
		}
		}
		
		
		System.out.println(Arrays.toString(a));
	}

}
