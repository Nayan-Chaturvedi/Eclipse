package string;

import java.util.Scanner;

public class ShortName_Find
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Full Name -");
		String fullName=sc.nextLine();
		
		nameFormate(fullName);
	}
	
	public static  void nameFormate(String fullName)
	{
		String name[]=fullName.split(" ");
		for(int i=0; i<name.length; i++)
		{
			if(i<name.length-1)
			{
				System.out.print(name[i].charAt(0)+". ");
			}
			
			else
			{
				System.out.print(name[i].toLowerCase());
			}
		}
				
	}
}
