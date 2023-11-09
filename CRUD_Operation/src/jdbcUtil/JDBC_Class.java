package jdbcUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC_Class 
{
	public static Connection getJdbcConncetion() throws IOException, SQLException
	{
		FileInputStream fis=new FileInputStream("Application.properties");
		Properties p=new Properties();
		p.load(fis);
		String url=p.getProperty("url");
		String user=p.getProperty("user");
		String password=p.getProperty("password");

		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
		Connection c=DriverManager.getConnection(url, user, password);
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
