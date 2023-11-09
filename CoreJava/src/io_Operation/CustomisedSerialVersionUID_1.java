package io_Operation;

import java.io.Serializable;

public class CustomisedSerialVersionUID_1 implements Serializable
{
	public static final long serialVersionUID=12121L;
	
	private String name;
	private int age;
	
	public CustomisedSerialVersionUID_1(String name, int age)
	{
		super();
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
	
	
	
	

}
