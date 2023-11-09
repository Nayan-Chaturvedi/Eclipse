package commands_JDBC_MySQL;

import java.sql.*;
import java.util.*;

public class InsertQuery_PreaparedStatement 
{
	public static void main(String[] args) 
	{
		Connection c=null;
		PreparedStatement ps=null;
		Scanner sc=new Scanner(System.in);

		try
		{
			c=LoadRegister_and_Close.getConnection();
			
			if(c!=null)
			{
				String query="INSERT INTO student VALUES(?,?)";
				
				System.out.println("Enter an Roll Number");
				int rollNum=sc.nextInt();			
				System.out.println("Enter an Student Name ");
				String name=sc.next();
				ps=c.prepareStatement(query);
				ps.setInt(1,rollNum );
				ps.setString(2, name);
				
				if(ps!=null)
				{
					int rowEffect=ps.executeUpdate();
					if(rowEffect==1)
					{
						System.out.println("Row Successfully inserted");
					}
					else
					{
						System.out.println("Row not Inserted");
					}
				}
			}
			

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				LoadRegister_and_Close.closeResource(c, ps);
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}
}
