package rough;

public class MazeProblem {
	
	public static void maze(int currentRow, int currentColoumn, int destRow, int destColoumn, String s)
	{
		if(currentRow == destRow && currentColoumn == destColoumn)
		{
			System.out.println(s);
			return;
		}
		if(currentColoumn > destColoumn || currentRow >destRow)
		{
			return;
		}
		
		maze(currentRow+1, currentColoumn, destRow, destColoumn, s+"H");
		maze(currentRow, currentColoumn+1, destRow, destColoumn, s+"V");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		maze(0, 0, 3, 3, "");
	}

}
