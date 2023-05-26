package projectPW;

import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	 int guessingNumber()
	{
		 System.out.println("GAME STARTED \n");
		 
		System.out.println("Guesser... kindly guess the number ");
		Scanner sc=new Scanner(System.in);
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Players
{
	int guessNum;
	
	int guessingNumber()
	{
		System.out.println("Player's... Kindly guess the number ");
		Scanner sc=new Scanner(System.in);
		guessNum=sc.nextInt();
		return guessNum;
	}
}

class Empire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessingNumber();
		
		
	}
	
	void collectNumFromPlayer()
	{
		Players p1=new Players();
		Players p2 =new Players();
		Players p3 =new Players();
		
		 numFromPlayer1=p1.guessingNumber();
		 numFromPlayer2=p2.guessingNumber();
		 numFromPlayer3=p3.guessingNumber();
		
	}
	
	void compareNum()
	{
	 if(numFromGuesser == numFromPlayer1)
	 {
		 if(numFromGuesser ==numFromPlayer2 && numFromGuesser ==numFromPlayer3)
		 {
			 System.out.println("Sabhi player's ne sahi ans kiya . Sabi winner hai");
		 }
		 else if(numFromGuesser ==numFromPlayer2)
		 {
			 System.out.println("Player1 & Player2 Won ");
		 }
		 else if(numFromGuesser ==numFromPlayer3)
		 {
			 System.out.println("Player1 & Player3 Won ");
		 }
		 else
		 {
			System.out.println("Player 1 won the game");  
		 }
	 }
	 else if(numFromGuesser == numFromPlayer2)
	 {
		 if(numFromGuesser ==numFromPlayer3)
		 {
			 System.out.println("Player 2 & Player3 won");
		 }
		 else
		 {
		 System.out.println("Player 2 won the game");
		 }
	 }
	 else if(numFromGuesser == numFromPlayer3)
	 {
		 System.out.println("Player 3 won the game");
	 }
	 else
	 {
		 System.out.println("Sabka guess galat hai . Kishi bhi player's ka guesser ke number se "
		 		+ "match nai hua  hai .");
	 }
	}
}


public class GuesserNumGame
{
	public static void main(String[] args) 
	{
		
			Empire e=new Empire();
			e.collectNumFromGuesser();
			e.collectNumFromPlayer();
			e.compareNum();
		
		
	}

}
