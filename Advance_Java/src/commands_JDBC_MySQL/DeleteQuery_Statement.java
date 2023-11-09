package commands_JDBC_MySQL;

import java.sql.*;

public class DeleteQuery_Statement {

	public static void main(String[] args)
	{
		Connection c=null;
		Statement s=null;
		
		try
		{
			c=LoadRegister_and_Close.getConnection();
			if(c!=null)
			{
				String query="DELETE FROM student WHERE rollNum=2";
				s=c.createStatement();
				if(s!=null)
				{
					int rowEffect=s.executeUpdate(query);
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
				LoadRegister_and_Close.closeResource(c, s);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}

	}

}
