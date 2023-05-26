package rough;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNum_Optimize2
{

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an size ");
		int size =sc.nextInt();
		
		int arr[]=new int[size];
		
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println("Enter an number at index : " +i);
			arr[i]=sc.nextInt();
		}
		
		System.out.println("You enter : \n" + Arrays.toString(arr));
		
		missingNum(arr);
	}
	
	public static void missingNum(int[] arr)
	{
		int sum=1;
		for (int i = 2; i < arr.length+1; i++) 
		{
			sum+=i;
			sum-=arr[i-2];
		}
		
		System.out.println("Missing number is : " +sum);
	}

}
