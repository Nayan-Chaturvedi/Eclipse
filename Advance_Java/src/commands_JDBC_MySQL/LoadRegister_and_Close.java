package commands_JDBC_MySQL;

import java.util.Properties;
import java.io.*;
import java.sql.*;

public class LoadRegister_and_Close 
{
	
	public static Connection getConnection() throws Exception
	{
		// Load 
		FileInputStream fis=new FileInputStream("Application.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("URL");
		String userName=p.getProperty("User");
		String password=p.getProperty("Password");
		
		System.out.println(url);
		System.out.println(userName);
		System.out.println(password);
		
		//Register
		Connection c=DriverManager.getConnection(url, userName, password);
		System.out.println("Connection Establish");
		return c;
	
	}
	
	public static void closeResource(Connection c, Statement s) throws SQLException
	{
		if(c!=null)
		{
			c.close();
		}
		if(s!=null)
		{
			s.close();
		}
		
	}
	
}
