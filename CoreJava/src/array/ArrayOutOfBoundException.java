package array;

public class ArrayOutOfBoundException {

	public static void main(String[] args)
	{
		int n[]= {10,2,30,40,50};
		
		
		
		for (int i = 0; i < n.length; i++) 
		{
			System.out.println(n[i] +" \n");
		}
		System.out.println("For last value fetch use this " +n[n.length-1] +"\n");
		
		System.out.println("For avoid ArrayOutOfBoundException use always n.length \n");
		
		for (int i : n) 
		{
			System.out.println(i);
		}
		
		System.out.println("\n Otherwise use enhance for loop");
	}
		
	
}


