package array;

public class TraversingArray_Loop {

	public static void main(String[] args) 
	{
		int age[]=new int[4];
		
		age[0]=10;
		age[1]=20;
		age[3]=40;
		age[2]=30;
		
		for (int i = 0; i < age.length; i++) 
		{
			System.out.println(age[i]);
		}
		
		System.out.println("\n");

		//while loop
		
		int i=0;
		while(i<age.length)
		{
			System.out.println(age[i]);
			i++;
		}
		
		System.out.println("\n");
		
		int [][]array = {{1,2,3},{4,5},{6,7,8,9}};
		
		for (int j = 0; j < array.length; j++)
		{
			for (int j2 = 0; j2 <array[j].length; j2++) 
			{
				System.out.print(array[j][j2] + " ");
			}
			System.out.println();
		}
	}

}
