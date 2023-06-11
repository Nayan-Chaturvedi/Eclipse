package rough;

public class BalancedPanathesis_1 
{
	public static void balance(int n, int open, int close, String ways)
	{
		if(n == open && n==close)
		{
			System.out.println(ways);
			return;
		}
		if(n > open)
		{
		balance(n, open+1, close, ways + "(");
		}
		if(open > close)
		{
			balance(n, open, close+1, ways + ")");
		}
	}
	public static void main(String[] args) {
		balance(3,0,0,"");

	}

}
