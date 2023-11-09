package project_CarRentalSystem;

public class Car
{
	private String carID;
	private String brand;
	private String model;
	private double basePricePerDay;
	private boolean isAvailable;
	
	public Car(String carID, String brand, String model, double basePricePerDay)
	{
		super();
		this.carID = carID;
		this.brand = brand;
		this.model = model;
		this.basePricePerDay = basePricePerDay;
		this.isAvailable=true;
	}

	public String getCarID() 
	{
		return carID;
	}

	public void setCarID(String carID) 
	{
		this.carID = carID;
	}

	public String getBrand() 
	{
		return brand;
	}

	public void setBrand(String brand) 
	{
		this.brand = brand;
	}

	public String getModel()
	{
		return model;
	}

	public void setModel(String model)
	{
		this.model = model;
	}

	public double calculatePrice(int rentDays)
	{
		return basePricePerDay*rentDays;
	}

	public boolean isAvailable()
	{
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) 
	{
		this.isAvailable = isAvailable;
	}
	
	public void rent()
	{
		isAvailable=false;
	}
	
	public void returnCar()
	{
		isAvailable=true;
	}

}
