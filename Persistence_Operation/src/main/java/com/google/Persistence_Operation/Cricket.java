package com.google.Persistence_Operation;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cricket
{
	@Id
	private int player;
	private String name;
	
	
	public int getPlayer()
	{
		return player;
	}
	
	public void setPlayer(int player)
	{
		this.player = player;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return "Cricket [player=" + player + ", name=" + name + "]";
	}
	
	
}
