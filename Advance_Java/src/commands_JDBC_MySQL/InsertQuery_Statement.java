package commands_JDBC_MySQL;

import java.sql.*;

public class InsertQuery_Statement
{
	public static void main(String[] args) 
	{
		Connection c=null;
		Statement s=null;
		try 
		{
			c=LoadRegister_and_Close.getConnection();
			s=c.createStatement();
			if(s!=null)
			{
				String query="INSERT INTO student VALUES (4,'Vijay')";
				int rowUpdate=s.executeUpdate(query);
				if(rowUpdate==1)
				{
					System.out.println("Row Insert");
				}
				else
				{
					System.out.println("Row Not insert");
				}
			}
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				LoadRegister_and_Close.closeResource(c, s);
			}
			catch (SQLException e)
			{
		
				e.printStackTrace();
			}
		}
	}
}
