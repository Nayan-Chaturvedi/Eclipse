package array;

public class TrickyQuestionArrayPWNotes {

	public static void main(String[] args) 
	{
		int[] a,b;			//1-D Array both
		
		a=new int[2];		 //a=new int[2][2];
		b=new int[1];		//b=new int[1];
								
		
		System.out.println("A length =" +a.length);
		System.out.println("B length =" +b.length);
		
		int[][] c,d;
		
		c=new int[4][2];
		d=new int[9][10];
		
		c[0][0]=10;
		
		System.out.println("C length =" +c.length);
		System.out.println("D length =" +d.length);
		
		d[2][3]=10;
		
		
		int[] e[],f;
		
		e=new int[1][2];
		f=new int[2];
		
		int[] []h,g;
		
		g=new int[8][3];
		h=new int[2][3];
		
		g[5][1]=222;
		
		for(int[] z:g)
		{
			for(int y:z)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
