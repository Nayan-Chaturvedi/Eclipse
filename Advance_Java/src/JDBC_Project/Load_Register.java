package JDBC_Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.sql.*;

public class Load_Register 
{
	public static Connection gConnection() throws IOException, SQLException 
	{
		FileInputStream fis=new FileInputStream("Application.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		
		System.out.println("URL : " +url+" username : "+username+" password : " +password);
		Connection c=DriverManager.getConnection(url, username, password);
		System.out.println("Connection est");
		return c;
				
	}
	
	public static void clConnection1(Statement s, Connection c) throws SQLException
	{
		if(s!=null)
		{
			s.close();
		}
		if(c!=null)
		{
			c.close();
		}
	}

	
	
}
