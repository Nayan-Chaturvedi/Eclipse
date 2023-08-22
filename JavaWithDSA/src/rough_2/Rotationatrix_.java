package rough_2;

public class Rotationatrix_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		
		for (int i = 0; i < a.length; i++) 
		{
			for(int j = i; j < a.length; j++)
			{
				int temp = a[i][j];
				a[i][j]=a[j][i];
				a[j][i] =temp;
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i<a.length;i++)
		{
			int lowerIndex =0;
			int higherIndex = a.length-1;
			
			while(lowerIndex < higherIndex)
			{
				int temp = a[i][lowerIndex];
				a[i][lowerIndex]=a[i][higherIndex];
				a[i][higherIndex]=temp;
				
				lowerIndex++;
				higherIndex--;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i =a.length-1; i>=0;i--)
		{
			for(int j =0; j<i; j++)
			{
				int temp =a[i][j];
				a[i][j]=a[j][i];
				a[j][i]=temp;
			}
		}
		
		System.out.println();
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
