package array_1_D;

public class DuplicateNumber 
{
  public static void main(String[] args) 
  {
	int a[]= {1,2,3,4,5,6,6,2};
	boolean flag= true;
	
	for (int i = 0; i < a.length; i++) 
	{
		for (int j = i+1; j < a.length; j++) 
		{
			if(a[i]==a[j])
			{
				System.out.println("Duplicate element " + a[i] +" location is = " + i);
				 flag=false;
			}
		}
	}
	
	if(flag==true)
	{
		System.out.println("No Duplicate element found ");
	}
}
}
