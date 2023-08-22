package rough_2;

public class Ass_Soln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int a[] = {1,2,3,4,5};
//		  int i =0,sum =0;
//		  while(i < a.length)
//		  {
//			  sum += a[i];
//			  i=i+2;
//		  }
//		  
//		  System.out.println(sum);
//		  
		 
		System.out.println("/n For Each loop");

		int forEachSum = 0;
		for (int j : a) {
			if (j % 2 == 0) {
				forEachSum += a[j];
			}

		}
		System.out.println(forEachSum);
	}

}
