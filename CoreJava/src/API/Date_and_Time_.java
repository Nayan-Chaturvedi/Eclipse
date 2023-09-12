package API;

public class Date_and_Time_
{
	public static void main(String[] args)
	{
		java.util.Date dt =new java.util.Date();
		System.out.println(dt);
		
		long timeInMilisecond=dt.getTime();
		java.sql.Date dt1=new java.sql.Date(timeInMilisecond);
		System.out.println(dt1);
		
		
		// jo date class util package me hai wo 0-Parameterized hai
		// jo date class sql package me hai wo 0-parameterized nahi hai
	}
}
