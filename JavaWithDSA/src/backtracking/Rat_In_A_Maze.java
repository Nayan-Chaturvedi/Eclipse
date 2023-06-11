package backtracking;

public class Rat_In_A_Maze 
{
	public static int path(int maze[][], int destination)
	{
		// if source and destination is blocked the return 0
		if(maze[0][0] == -1 || maze[destination-1][destination-1] == -1)
		{
			return 0;
		}
		
		
		// Initilise the top most coloumn
		
		for (int i = 0; i < maze.length; i++) 
		{
			if(maze[i][0] == 0)
			{
				maze[i][0] =1;
			}
			
			// If there is blockage then break
			else
			{
			break;
			}
		}
		
		// Initilise the top most row
		
		for (int i = 1; i < maze.length; i++)
		{
			if(maze[0][i] == 0)
			{
				maze[0][i] = 1;
			}
			
			// if there is blockage then break
			
			else
			{
			break;
			}
		}
		
		for (int i = 1; i < destination; i++) 
		{
			for (int j = 1; j < destination; j++) 
			{
				if(maze[i][j] == -1)
				{
					continue;
				}
				// if we reach maze[i][j] from [i-1][j] then increment count
				if(maze[i-1][j] > 0)
				{
					maze[i][j] += maze[i-1][j];
				}
				// if we reach maze[i][j] from [i][j-1] then increment count
				if(maze[i][j-1] > 0)
				{
					maze[i][j] += maze[i][j-1];
				}
			}
		}
		return maze[destination-1][destination-1];
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int maze[][] = {
				{0,0,0,0},
				{0,-1,0,0},
				{-1,0,0,0},
				{0,0,0,0}};
		
		
		
		int path = path(maze, maze.length);
		
		System.out.println(path);
		
	}

}
