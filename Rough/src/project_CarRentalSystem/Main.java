package project_CarRentalSystem;

public class Main {

	public static void main(String[] args)
	{
		CarRentalSystem_ crs=new CarRentalSystem_();
		
		Car car1=new Car("001", "Mahindra", "Thar", 150.0);
		Car car2=new Car("002", "Toyato", "Canry", 60.0);
		Car car3=new Car("003", "Honda", "Accord", 70.0);
		
		crs.addCar(car3);
		crs.addCar(car2);
		crs.addCar(car1);
		
		crs.menu();

	}

}
