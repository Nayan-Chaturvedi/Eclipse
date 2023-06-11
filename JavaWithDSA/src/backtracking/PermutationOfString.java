package backtracking;

import java.util.Scanner;

public class PermutationOfString 
{
	public static String swap(String s, int left, int i)
	{
		char[] charArray=s.toCharArray();
		
		char temp = charArray[left];
		charArray[left] = charArray[i];
		charArray[i] = temp;
		
		return String.valueOf(charArray);
		
	}
	public static void permute(String s, int left, int right)
	{
		if(left == right)
		{
			System.out.println(s);
		}
		else
		{
			for (int i = left; i <= right; i++)
			{
				s=swap(s, left, i);
				permute(s, left+1, right);
				
				//backtracking
				s=swap(s, left, i);
			}
		}
	}


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an String");
		String s=sc.next();
		
		int right = s.length()-1;
		
		System.out.println("Combination of Word " + s + " is :");
		
		permute(s, 0, right);
	}

}
