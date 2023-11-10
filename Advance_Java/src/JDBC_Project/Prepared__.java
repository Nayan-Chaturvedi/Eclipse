package JDBC_Project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

class Operation
{
	int operation;
	Scanner sc=new Scanner(System.in);
	
	Connection c=null;
	PreparedStatement ps=null;
	
	public void selectOperation()
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("\n Which operation you want to perform ");
		System.out.println("\n 1: SELECT \n 2: UPDATE \n 3: INSERT \n 4: DELETE \n 5: EXIT \n");
		System.out.println("Enter an operation");
		operation=sc.nextInt();	
	}
	
	public void cases() throws SQLException
	{
		
		switch(operation)
		{
		case 1:
			{
				System.out.println("\n You choose : " +operation+" \n");
				String query ="SELECT * FROM electricityBill.cst ";
				ps=c.prepareStatement(query);
				
				if(ps!=null)
				{
					ResultSet rs=ps.executeQuery();
					if(rs!=null)
					{
						System.out.println("ID\t NAME \n");
						while(rs.next())
						{
							System.out.println(rs.getInt(1)+"   :	"+rs.getString(2));
						}
					}
				}
			}
			
			break;
			
		case 2:
		{
			System.out.println("\n You choose : " +operation+" \n");
			String query ="UPDATE cst SET name=? WHERE id=?";
			ps=c.prepareStatement(query);
			System.out.println("Enter an id you want to update");
			int id=sc.nextInt();
			ps.setInt(2, id);
			System.out.println("Enter an Update Name");
			String name=sc.next();
			ps.setString(1, name);
			
			if(ps!=null)
			{
				int effect=ps.executeUpdate();
				if(effect==1)
				{
					System.out.println(name+" successfully update");
				}
				else
				{
					System.out.println("Error occur in row update");
				}
			}			
		}
		
		break;
		
		case 3:
		{
			System.out.println("\n You choose : " +operation+" \n");
			String query="INSERT INTO cst VALUES (?,?)";
			ps=c.prepareStatement(query);
			System.out.println("Enter an id ");
			int id=sc.nextInt();
			System.out.println("Enter an name");
			String name=sc.next();
			ps.setInt(1, id);
			ps.setString(2, name);
			if(ps!=null)
			{
				int effect=ps.executeUpdate();
				if(effect==1)
				{
					System.out.println(name+" successfully inserted");
				}
				else
				{
					System.out.println("Error Occur in row inserted");
				}
			}
		}
		
		break;
		
		case 4:
		{
			System.out.println("\n You choose : " +operation+" \n");
			String query="DELETE FROM cst WHERE id=?";
			System.out.println("Enter an id You want to delete");
			int id=sc.nextInt();
			ps=c.prepareStatement(query);
			ps.setInt(1, id);
			if(ps!=null)
			{
				int effect=ps.executeUpdate();
				if(effect==1)
				{
					System.out.println(id+" row successfully deleted");
				}
				else
				{
					System.out.println("Row not delete");
				}
			}
		}
		break;
		
		case 5:
		{
			System.out.println("\n You choose : " +operation+" \n");
			System.out.println("\t \t THANKS YOU");
			System.exit(0);
		}
		break;
		
	  }		
		
	}
}
public class Prepared__ 
{		
	public static void main(String[] args)
	{
		Operation op=new Operation();	
		
		try
		{
			op.c=Load_Register.gConnection();
			if(op.c!=null)
			{	
					while(true)
					{
						op.selectOperation();
						op.cases();	
					}
			}
		}
		catch(Exception e)
		{
			System.out.println("Error Occur");
		}
		
		finally
		{
			try
			{
				Load_Register.clConnection1(op.ps, op.c);
			}
			catch(Exception e)
			{
				System.out.println("Eroor Occur in close Connectio");
			}
		}
	}
}
