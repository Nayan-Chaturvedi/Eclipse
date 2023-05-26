package rough;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Rotation_Matrix1 
{
	public static void rotation(int c[][])
	{
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = i; j < c[0].length; j++)
			{
				int temp= c[i][j];
				c[i][j]=c[j][i];
				c[j][i]=temp;
			}
		}
		
		
		
		for (int i = 0; i < c.length; i++) 
		{
			int n=0;
			int m=c[0].length-1;
			
			while(n<m)
			{
			
				int temp =c[i][n];
				c[i][n]=c[i][m];
				c[i][m]=temp;
				
				n++;
				m--;
			}
			
		}
		
		System.out.println("Rotation of matrix is --");
		
		for (int  i= 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[0].length; j++) 
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		
		System.out.println("Enter an Row ");
		a=sc.nextInt();
		System.out.println("Enter an coloumn");
		b=sc.nextInt();
		
		int c[][]=new int[a][b];
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[0].length; j++) 
			{
				System.out.println("Enter an elements in a matrix");
				c[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("You enter --");
		
		for (int i = 0; i < c.length; i++) 
		{
			for (int j = 0; j < c[0].length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
		rotation(c);
	}

}
