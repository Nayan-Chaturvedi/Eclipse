package projectATM;

import java.util.*;

public class MainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		AtmOperationInterface ao = new AtmOperationImplement();
		
		
			
		int atmNumber = 1234;
		int atmPin = 1234;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n WELCOME \n");
		System.out.println("Enter ATM Number :");
		int Num= sc.nextInt();
		System.out.println("Enter ATM Pin :");
		int Pin = sc.nextInt();
		
		if((atmNumber == Num) && (atmPin == Pin))
		{
			System.out.println("Validation Done");
			
			while(true)
			{
				System.out.println("\n 1. View Available Balance \n 2. Withdrow Amount \n"
						+ "3. Deposit Amount \n 4. Mini statement \n 5. Exit");
				
				System.out.println("Enter Choice :");
				int ch = sc.nextInt();
				
				if(ch ==1)
				{
					ao.viewBalance();
				}
				else if(ch ==2)
				{
					System.out.println("Enter Amount to Withdraw");
					double withdraw = sc.nextDouble();
					ao.withdrawAmount(withdraw);
				}
				else if(ch==3)
				{
					System.out.println("Enter Deposit Amount ");
					double depositAmount = sc.nextDouble();
					ao.depositAmount(depositAmount);
				}
				else if(ch==4)
				{
					ao.viewMiniStatement();
				}
				else if(ch ==5)
				{
					System.out.println("Collect your ATM card \n\n THANK YOU");
					System.exit(0);
				}
				else
				{
					System.out.println("Please Enter correct choice");
				}
				
			}
		}
		else
		{
			System.out.println("Incorrect Atm Number or Pin");
			System.out.println("Please try again");
			System.exit(0);
		}
	}

}
