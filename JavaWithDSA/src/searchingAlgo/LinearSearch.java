package searchingAlgo;
 // Time complexity =0(n);
// Space complexity =0(1);
import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an number of elements present in array");
		int n=sc.nextInt();
		
		int a[]=new int[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.println("Enter an Element");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter an Target element");
		int m=sc.nextInt();
		
		int elementNotFound=-1;
		
		
		
		for(int i=0; i<n; i++)
		{
			if(a[i]==m)
			{
				System.out.println("Element found in position : " + i);
				elementNotFound=1;
			}
		}
		if(elementNotFound==-1)
		{
			System.out.println("Target element is not present in this array");
		}
	}
}
