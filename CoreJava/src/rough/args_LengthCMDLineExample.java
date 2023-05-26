package rough;

public class args_LengthCMDLineExample
{
		// It's take input from command line 
	public static void main(String[] args)
	{
		int x;
		
		if(args.length>0)
		{
			x=10;
		}
		else
		{
			x=5;
		}
		System.out.println(x);
	}

}
