package projectPW;

import java.util.Scanner;

import java.util.*;

class MyException extends Exception
{
	
	
}

class Facebook
{
	String userName ="Nayan";
	int password=1234;
	String enterUserName;
	int enterUserPassword;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an User Name");
		enterUserName=sc.next();
		System.out.println("Enter an Password");
		enterUserPassword=sc.nextInt();
	}
	
	public void validate() throws MyException
	{
		if(userName.equals(enterUserName) && password==enterUserPassword)
		{
			System.out.println("Welcome Your Account");
		}
		else
		{
			MyException me=new MyException();
			throw me;
		}
	}
}

class FbCompany
{
	public void check()
	{
		Facebook fb=new Facebook();
		
		try 
		{
			System.out.println("3 Chance");
			fb.input();
			fb.validate();
		} 
		catch (MyException e)
		{
			try 
			{
				System.out.println("2 Chance Left");
				
				fb.input();
				fb.validate();
			} 
			catch (MyException ee)
			{
				try 
				{
					System.out.println("1 Chance Left");
					fb.input();
					fb.validate();
				} 
				catch (MyException eee)
				{
					System.out.println("Your Account has been Blocked");
				}
			}
			
			
		}
	}
}
public class FaceBook__
{
	public static void main(String[] args) 
	{
		FbCompany fbc=new FbCompany();
		fbc.check();

	}

}

