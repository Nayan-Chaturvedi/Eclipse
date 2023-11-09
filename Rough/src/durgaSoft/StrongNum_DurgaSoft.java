package durgaSoft;

public class StrongNum_DurgaSoft {

	public static void main(String[] args) 
	{
		int n=145;
		int temp=0;
		
		int sum=0;
		
		while(n>0)
		{
			temp= n%10;
			int fact =1;
			
			while(temp>0)
			{
			
			fact = fact * temp;
			temp--;
			}
			
			sum= sum + fact;
			n=n/10;
			
		}
		
		System.out.println(sum);

	}

}
