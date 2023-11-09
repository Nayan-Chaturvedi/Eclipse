package myPack;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {

	public static void main(String[] args) 
	{
		try
		{
			String url="jdbc:mysql://localhost:3306/";
			String userName="root";
			String password="nayan123@";
			
			Connection c= DriverManager.getConnection(url, userName, password);
			System.out.println("Connection successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
