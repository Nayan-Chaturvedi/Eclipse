package array;

public class EnhanchedForLoop2_DArray {

	public static void main(String[] args) 
	{
		int[][] nums=
			{
				{1,23,34,5},
				{4,8},
				{23,66,5}
			};
		
		for(int a[]:nums)
		{
			for(int b:a)
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}

	}

}
