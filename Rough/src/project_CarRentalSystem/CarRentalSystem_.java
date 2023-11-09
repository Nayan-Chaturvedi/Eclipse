package project_CarRentalSystem;

import java.util.*;

public class CarRentalSystem_ 
{
	private List<Car> cars;
	private List<Customer> customers;
	private List<Rental> rentals;
	
	public CarRentalSystem_()
	{
		cars= new ArrayList<>();
		customers= new ArrayList<>();
		rentals= new ArrayList<>();
	}
	
	public void addCar(Car car)
	{
		cars.add(car);
	}
	
	public void addCustomer(Customer customer)
	{
		customers.add(customer);
	}
	
	public void rentCar(Car car, Customer customer, int days)
	{
		if(car.isAvailable())
		{
			car.rent();
			rentals.add(new Rental(car, customer, days));
		}
		else
		{
			System.out.println("Car is not available");
		}
	}
	
	public void reantalCar(Car car)
	{
		car.returnCar();
		Rental rentalToRemove = null;
		for(Rental rental : rentals)
		{
			if(rental.getCar() == car)
			{
				rentalToRemove = rental;
				break;
			}
		}
		
		if(rentalToRemove!= null)
		{
			rentals.remove(rentalToRemove);
			System.out.println("Car Renturn Successfully");
		}
		else
		{
			System.out.println("Car was not return");
		}
	}
	
	public void menu()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("CAR RENTAL SYSTEM");
			System.out.println("1. Rent a Car");
			System.out.println("2. Return a Car");
			System.out.println("3. Exit");
			System.out.println("Enter your choice");
			
			int choice =sc.nextInt();
			sc.nextLine();
			
			if(choice ==1)
			{
				System.out.println("\n Rent  a Car \n");
				System.out.println("Enter your name");
				String customerName=sc.next();
				
				System.out.println("\n Available Car \n");
				for(Car car: cars)
				{
					if(car.isAvailable())
					{
						System.out.println(car.getCarID() +" " +car.getBrand()+" "+ car.getModel());
					}
				}
				
				System.out.println("Enter Car Id you want to Rent");
				String carId=sc.next();
				
				System.out.println("Enter The number of days for rental");
				int rentalDays=sc.nextInt();
				sc.nextLine();
				
				Customer newCustomer =new Customer("CUS ID"+(customers.size()+1), customerName);
				addCustomer(newCustomer);
				
				Car selectedCar =null;
				for(Car car : cars)
				{
					if(car.getCarID().equals(carId) && car.isAvailable())
					{
						selectedCar = car;
						break;
					}
					
				}
				
				if(selectedCar!=null)
				{
					double totalPrice =selectedCar.calculatePrice(rentalDays);
					System.out.println("\n Rental Information \n");
					System.out.println("Customer ID " +newCustomer.getCustomerID());
					System.out.println("Customer Name "+newCustomer.getName());
					System.out.println("Car "+selectedCar.getBrand()+" "+selectedCar.getModel());
					System.out.println("Rental Days "+ rentalDays);
					System.out.println("Total Price $ " + totalPrice);
					
					System.out.println("\n Confirm Rental (Y/N) \n");
					String confirm=sc.next();
					
					if(confirm.equalsIgnoreCase("Y"))
					{
						rentCar(selectedCar, newCustomer, rentalDays);
						System.out.println("\n Car Rent Successfully");
					}
					else
					{
						System.out.println("\n Rental Canceled \n");
					}
					
				}
				else
				{
					System.out.println("\n Invalid Car selected or car not available for rent \n");
				}
			}
			
			else if(choice==2)
			{
				System.out.println("\n Return a Car");
				String carID=sc.next();
				
				Car carToReturn=null;
				for(Car car : cars)
				{
					if(car.getCarID().equals(carID) && !car.isAvailable())
					{
						carToReturn=car;
						break;
					}
				}
				
				if(carToReturn!= null)
				{
					Customer customer =null;
					for(Rental rental : rentals)
					{
						if(rental.getCar() == carToReturn)
						{
							customer =rental.getCustomer();
							break;
						}
					}
					
					
				}
				
			}
				
			
		}
	}
}
