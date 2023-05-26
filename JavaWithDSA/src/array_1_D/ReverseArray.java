package array_1_D;

public class ReverseArray 
{
	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5,6};
		int temp ;
		
		for (int i = 0; i < a.length/2; i++) 
		{
			temp=a[a.length-i-1];
			a[a.length-i-1]=a[i];
			a[i]=temp;
		}
		
		System.out.println("Reversal of Array");
		System.out.println();
		
		for (int i : a) 
		{
			System.out.print(i + " ");
		}
	}
}
