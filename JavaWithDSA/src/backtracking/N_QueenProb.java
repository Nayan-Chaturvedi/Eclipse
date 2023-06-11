package backtracking;

public class N_QueenProb 
{
	//public class N_QueenProb {

	    public static void print(int board[][], int n) {
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(board[i][j]);
	            }
	            System.out.println();
	        }
	    }

	    public static boolean isSafe(int board[][], int row, int col, int n) {
	        int i, j;

	        for (i = 0; i < n; i++) {
	            if (board[i][col] == 1) {
	                return false;
	            }
	        }

	        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
	            if (board[i][j] == 1) {
	                return false;
	            }
	        }

	        for (i = row, j = col; i >= 0 && j < n; i--, j++) {
	            if (board[i][j] == 1) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static boolean nQueen(int board[][], int row, int n) {
	        if (row == n) {
	            return true;
	        }

	        for (int col = 0; col < n; col++) {
	            if (isSafe(board, row, col, n)) {
	                board[row][col] = 1;
	                if (nQueen(board, row + 1, n) == true) {
	                    return true;
	                }
	                board[row][col] = 0;
	            }
	        }

	        return false;
	    }

	    public static void main(String[] args) {
	        int board[][] = {
	                {0, 0, 0, 0},
	                {0, 0, 0, 0},
	                {0, 0, 0, 0},
	                {0, 0, 0, 0}
	        };

	        nQueen(board, 0, board.length);
	        print(board, board.length);
	    }
	}
