package student_Management_System;

import java.time.*;
import java.util.Scanner;

class MyException extends Exception
{
	MyException(String msg)
	{
		super(msg);
	}
	
	MyException()
	{
		
	}
}
class Student
{
	String userName;
	int userPw;
	String name="Nayan";
	int pw=1234;
	
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an user name");
		userName=sc.next();
		System.out.println("Enter an user password");
		userPw=sc.nextInt();
	}
	
	public void check() throws MyException 
	{
		if(userName.equals(name) && userPw==pw)
		{
			System.out.println("Welcome Nayan");
		}
		else
		{
			MyException me=new MyException();
			throw me;
		}
	}
}


 class StudentValidate
{
	 Student st=new Student();
	 
	 
	 public void validate() throws MyException
	 {
		 try
		 {
			 st.input();
			 st.check();
			 
		 }
		 catch(Exception e)
		 {
			 try
			 {
				 System.out.println("\n 2 chance left \n" );
				
				 st.input();
				 st.check();
			 }
			 catch(Exception ee)
			 {
				try
				{
					System.out.println("\n 1 chance left \n" );
					st.input();
					 st.check();
				}
				catch(Exception eee)
				{
					MyException me=new MyException();
					throw me;
				}
			 }
		 }
	 }
		

	

}
