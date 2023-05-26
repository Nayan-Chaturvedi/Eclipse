package rough;

import java.util.Scanner;

public class FirstOccurance_3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an digit you have search");
		int target = sc.nextInt();
		
		int a[] = {1,2,2,3,4,6,6,6,7,8,8,9};
		
		int result = first_Occcurance(a,target);
		System.out.println("Index is : " +(result+1));
	}
	
	public static int first_Occcurance(int[]a,int target)
	{
		int lower_Index =0;
		int higher_Index = a.length-1;
		int result =-1;
		
		while(lower_Index <= higher_Index)
		
		{
			int mid = lower_Index +(higher_Index - lower_Index)/2;
			
			if(a[mid] == target)
			{
				result = mid;
				higher_Index = mid-1;
			}
			else if(a[mid] < target)
			{
				lower_Index = mid +1;
			}
			else
			{
				higher_Index = mid -1;;
			}
		}
		return result;
	}

}
