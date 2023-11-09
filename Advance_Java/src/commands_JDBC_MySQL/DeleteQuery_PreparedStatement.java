package commands_JDBC_MySQL;

import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class DeleteQuery_PreparedStatement
{

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
				String query ="DELETE FROM student WHERE rollNum=?";
				ps=c.prepareStatement(query);
				System.out.println("Enter an Roll number You want to delete");
				int rollNum=sc.nextInt();
				ps.setInt(1, rollNum);
				if(ps!=null)
				{
					int rowEffect=ps.executeUpdate();
					if(rowEffect==1)
					{
						System.out.println("Row Successfully delete");
					}
					else
					{
						System.out.println("Row not delete");
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
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
