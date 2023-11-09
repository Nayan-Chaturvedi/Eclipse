package commands_JDBC_MySQL;

import java.sql.*;
import java.util.*;

public class SelectQuery_PreaparedStatement
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Connection c=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try
		{
			c=LoadRegister_and_Close_ResultSet.getJdbcConnectionn();
			if(c!=null)
			{
				String query="SELECT * FROM student WHERE rollNum=?";
				ps=c.prepareStatement(query);
				if(ps!=null)
				{
					System.out.println("Enter an Roll number You want to get Database");
					int rollNum=sc.nextInt();
					ps.setInt(1, rollNum);
					rs=ps.executeQuery();
					if(rs!=null)
					{
						if(rs.next())
						{
							
							System.out.println("Roll number \t Name");
							System.out.println(rs.getInt(1)+" \t\t"+rs.getString(2));
						}
						else
						{
							System.out.println("No row availabe");
						}
						
							
					}
					
					
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
				LoadRegister_and_Close_ResultSet.closeConnection(c, ps, rs);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
