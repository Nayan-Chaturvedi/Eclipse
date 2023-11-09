package student_Management_System;

import java.util.Scanner;


public class Main 
{

	public static void main(String[] args)
	{
		StudentValidate sv=new StudentValidate();
		try
		{
			sv.validate();
		}
		catch(Exception e)
		{
			System.out.println("Sorry .. This is not Your ACcount");
			System.exit(0);
		}
		
		
		MenuOption mo =new MenuOption();
		mo.task();
				
	}

}
