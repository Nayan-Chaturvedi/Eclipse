package com.google.HibDemo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Mall_Discribe")

public class Mall
{
	@Id
	@Column(name = "Shop_Number")
	private int shopNum;
	@Column(name = "Shop_Name")
	private String shopName;
	
	
	public int getShopNum() 
	{
		return shopNum;
	}
	
	public void setShopNum(int shopNum)
	{
		this.shopNum = shopNum;
	}
	
	public String getShopName()
	{
		return shopName;
	}
	
	public void setShopName(String shopName)
	{
		this.shopName = shopName;
	}
	
	@Override
	public String toString()
	{
		return "Shop Number : " +shopNum+"  Shop Name : "+shopName;	
	}
	
}