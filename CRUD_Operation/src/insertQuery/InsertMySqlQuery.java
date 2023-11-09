package insertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcUtil.JDBC_Class;

public class InsertMySqlQuery {

	public static void main(String[] args) throws IOException
	{
		Connection c=null;
		Statement s=null;
		try 
		{
			c=JDBC_Class.getJdbcConncetion();
			if(c!=null)
			{
				s=c.createStatement();
				String myInsertQuery="INSERT INTO stdt  VALUES ('Nayam',123)";
				int rowEffected=s.executeUpdate(myInsertQuery);
				
				if(rowEffected ==1)
				{
					System.out.println("Row Insert");
				}
				else
				{
					System.out.println("Row not Inserted");
				}

			}
		} 
		catch (IOException | SQLException e)
		{		
			e.printStackTrace();
		}
		finally
		{
			try {
				JDBC_Class.closeResource(c, s);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
