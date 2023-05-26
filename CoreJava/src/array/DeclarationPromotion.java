package array;

public class DeclarationPromotion {

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		
		a[0]=1;
		a[1]=2;
		
		byte b=10;
		a[2]=b;
		
		short s=20;
		a[3]=s;
		a[4]='a'; // char Initilization .But value of a in UTF is 97 
		
		for(int d:a)
		{
			System.out.println(d);
		}
		

	}

}
