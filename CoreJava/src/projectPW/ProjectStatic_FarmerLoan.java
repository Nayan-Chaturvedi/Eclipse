package projectPW;

import java.util.*;

class Farmer
{
	int pricipalAmount;
	float timeDuration;
	static float rateOfInterest;
	float simpleInterest;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please mention the amount required");
		pricipalAmount=sc.nextInt();
		System.out.println("Please mention time duration");
		timeDuration=sc.nextFloat();
		rateOfInterest=8.5f;
	}
	
	void compute()
	{
		simpleInterest=( pricipalAmount * rateOfInterest * timeDuration)/100f ;
	}
	
	void display()
	{
		System.out.println("Simple interest is = " + simpleInterest );
	}
}

public class ProjectStatic_FarmerLoan {

	public static void main(String[] args) 
	{
		Farmer f1=new Farmer();
		f1.input();
		f1.compute();
		f1.display();
		
		Farmer f2 = new Farmer();
		f2.input();
		f2.compute();
		f2.display();

	}

}
