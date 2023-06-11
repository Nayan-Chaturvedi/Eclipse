package rough;

public class PrintPath_1 {
	
	public static void printPath(int startingIndex, int destinationIndex, String path)
	{
		if(destinationIndex == startingIndex)
		{
			System.out.println(path);
			return;
		}
		
		if(startingIndex > destinationIndex)
		{
			return;
		}
		printPath(startingIndex +1, destinationIndex, path +"1");
		printPath(startingIndex +2, destinationIndex, path +"2");
		printPath(startingIndex +3, destinationIndex, path +"3");
		printPath(startingIndex +4, destinationIndex, path +"4");
		printPath(startingIndex +5, destinationIndex, path +"5");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPath(0,4,"");
	}

}
