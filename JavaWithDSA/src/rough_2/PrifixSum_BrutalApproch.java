package rough_2;

import java.util.Scanner;

public class PrifixSum_BrutalApproch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		
		for (int[] is : a) {
			for (int is2 : is) {
			System.out.print(is2 + " ");	
			}
			System.out.println();
		}
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter an X1 coordinates");
		int x1 =sc.nextInt();
		
		System.out.println("Enter Y1 coordinates");
		int y1 =sc.nextInt();
		
		System.out.println("Enter an x2 coordinates");
		int x2 =sc.nextInt();
		
		System.out.println("Enter an Y2 coordinates");
		int y2 =sc.nextInt();
		
		prifixSumBrutal(a,x1,y1,x2,y2);
	}
	
	public static void prifixSumBrutal(int a[][], int x1, int y1, int x2, int y2)
	{
		int sum =0;
		
		for(int i= x1; i<=x2; i++)
		{
			for(int j= y1; j<=y2; j++)
			{
				sum+=a[i][j];
			}
		}
		
		System.out.println("Sum is : "+sum);
	}

}
