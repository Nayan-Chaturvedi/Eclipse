package com.google.Persistence_Operation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cricket_player_information")
public class Cricket
{
	@Id
	@Column(name = "Age")
	private int playerAge;
	
	@Column(name = "Name_of_Player", nullable = false)
	private String name_of_player;
	
	
	public int getPlayerAge() 
	{
		return playerAge;
	}
	
	public void setPlayerAge(int playerAge)
	{
		this.playerAge = playerAge;
	}
	
	public String getName()
	{
		return name_of_player;
	}
	
	public void setName(String name_of_player)
	{
		this.name_of_player = name_of_player;
	}
	
	@Override
	public String toString()
	{
		return "Cricket [Name : "+ name_of_player+" | Age : "+playerAge+"]";
	}
	
	
	
}
