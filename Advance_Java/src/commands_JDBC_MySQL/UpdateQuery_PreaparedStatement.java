package commands_JDBC_MySQL;

import java.sql.*;
import java.util.Scanner;

public class UpdateQuery_PreaparedStatement {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Connection c=null;
		PreparedStatement ps=null;
		
		try 
		{
			c=LoadRegister_and_Close.getConnection();
			if(c!=null)
			{
				String query="UPDATE student SET name=? WHERE rollNum=?";	
				System.out.println("Enter an Roll Number which you want to update");
				int rollNum=sc.nextInt();
				System.out.println("Enter an Update Name");
				String updatedName=sc.next();
				ps=c.prepareStatement(query);
				ps.setString(1, updatedName);
				ps.setInt(2, rollNum);
				if(ps!=null)
				{
					int rowEffect=ps.executeUpdate();
					if(rowEffect==1)
					{
						System.out.println("Update Successfully");
					}
					else
					{
						System.out.println("Row not Update");
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
				LoadRegister_and_Close.closeResource(c, ps);
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}

	}

}
