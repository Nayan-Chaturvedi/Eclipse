package array;

class demoMultiarray
{
	void multiarray()
	{
		int[][] a=new int[2][3];
		int b[][]= {{9,1},{1,2,},{3,4,5,6,}};
		
		for (int[] is : b) 
		{
			for (int is2 :is)
			{
				System.out.print(is2 + " ");
			}
			System.out.println();
		}
		
		System.out.println( " \n"+ b[0][0]);
		System.out.println("Length of array =" + b.length);
	}
}

public class Simple2_DArray {

	public static void main(String[] args)
	{
		demoMultiarray d=new demoMultiarray();
		d.multiarray();
	}

}
