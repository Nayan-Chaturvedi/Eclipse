package rough;

public class MaximumNum {

	public static void main(String[] args) {
		
		int a[]= {10,23,12,1,45,78,90,8};
		
		for (int i = 0; i < a.length; i++) 
		{
			
			if(a[i]>a[i+1])
			{
				int temp = a[i];
				a[i] =a[i+1];
				a[i+1]  =temp;
			
			}
		}
		
		System.out.println("Maximun : " + a[a.length-1]);

	}

}
