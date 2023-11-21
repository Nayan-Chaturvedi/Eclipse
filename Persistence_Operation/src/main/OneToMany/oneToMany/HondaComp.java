package oneToMany;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class HondaComp 
{
	@Id
	private int productId;
	private String productName;

	
	private List<Car> car;
	
	public List<Car> getCar() 
	{
		return car;
	}

	public void setCar(List<Car> car)
	{
		this.car = car;
	}

	public int getProductId()
	{
		return productId;
	}
	
	public void setProductId(int productId)
	{
		this.productId = productId;
	}
	
	public String getProductName()
	{
		return productName;
	}
	
	public void setProductName(String productName)
	{
		this.productName = productName;
	}

	@Override
	public String toString()
	{
		return "HondaComp [productId=" + productId + ", productName=" + productName + "]";
	}
	
	
	
	
}
