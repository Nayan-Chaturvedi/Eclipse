package commands_JDBC_MySQL;

import java.sql.*;
import java.util.Properties;
import java.io.*;

public class LoadRegister_and_Close_ResultSet
{
	public static Connection getJdbcConnectionn() throws IOException, SQLException
	{
		FileInputStream  fis=new FileInputStream("Application.properties");
		Properties p=new Properties();
		p.load(fis);
		
		String url=p.getProperty("URL");
		String User=p.getProperty("User");
		String Password=p.getProperty("Password");
		
		System.out.println(url);
		System.out.println(User);
		System.out.println(Password);
		
		Connection c=DriverManager.getConnection(url, User, Password);
		return c;
	}
	
	public static void closeConnection(Connection c, PreparedStatement ps, ResultSet rs) throws SQLException
	{
		if(c!=null)
		{
			c.close();
		}
		if(ps!=null)
		{
			ps.close();
		}
		if(rs!=null)
		{
			rs.close();
		}
	}
	
}
