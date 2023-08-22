package rough_2;

public class Ass_Soln_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {
				{1,2,3,5},
				{4,5,6,10},
				{7,8,9,15},
				{20,21,22,23}
		};
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				
//				if((i+j) < a.length-1)
//				{
//					System.out.println(a[i][j]);
//				}
//				
//			}
//		}
		
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a.length; j++) {
//				
//				
//				if(i==j )
//				{
//					System.out.print(a[i][j]);
//				}
//				
//				if((i+j) == (a.length-1) && i!=j)
//				{
//					System.out.print(a[i][j]);
//				}
//			}
		
//			for (int i = 0; i < a.length; i++) {
//				
//				System.out.print(a[i][i]);
//				
//				if(i!=a.length-1-i)
//				{
//					System.out.print(a[i][a.length-1-i]);
//				}
//			}
		
		for (int i = 0; i < a.length; i++) {
			
			System.out.println(a[i][a[i].length/2]);
			
		}
		for(int j=0;j<a.length; j++)
		{
			if(j==a.length/2)
				continue;
			System.out.println(a[a.length/2][j]);
		}
		
	}

}
