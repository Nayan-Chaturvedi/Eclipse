package oneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Car 
{
	@Id
	private int carId;
	private String carName;
	@ManyToOne
	
	private HondaComp hCompany;
	
	public HondaComp gethCompany() 
	{
		return hCompany;
	}

	public void sethCompany(HondaComp hCompany)
	{
		this.hCompany = hCompany;
	}

	public void setCarId(int carId)
	{
		this.carId=carId;
	}
	
	public int getCarId()
	{
		return carId;
	}

	public String getCarName()
	{
		return carName;
	}

	public void setCarName(String carName)
	{
		this.carName = carName;
	}

	@Override
	public String toString()
	{
		return "Car [carId=" + carId + ", carName=" + carName + "]";
	}
	
	
}
