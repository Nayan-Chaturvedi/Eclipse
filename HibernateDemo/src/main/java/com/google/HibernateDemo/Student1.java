package com.google.HibernateDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Student1 
{
	@Id
	private int rollNum;
	
	private String name;
	private int marks;
	
	
	public int getRollNum()
	{
		return rollNum;
	}
	
	public void setRollNum(int rollNum)
	{
		this.rollNum = rollNum;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getMarks()
	{
		return marks;
	}
	
	public void setMarks(int marks) 
	{
		this.marks = marks;
	}
	
	@Override
	public String toString()
	{
		return "RollNumber = "+rollNum +", Name = "+ name+", Marks = "+ marks;
	}
	
	
}
