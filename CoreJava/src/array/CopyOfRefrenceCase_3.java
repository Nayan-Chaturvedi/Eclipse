package array;

class CopyOfRefrenceCase_3 {

	public static void main(String[] args) 
	{
	 int a[]= {10,20,30,40};
	 int b[]= {500,200};
	 
	 System.out.println("Length of A =" + a.length);
	 System.out.println("Length of B =" + b.length);
	 
	 for(int c:a)
	 {
		 System.out.println(c);
	 }
	 
	 for (int d:b)
	 {
		 System.out.println(d);
	 }
	 
	 System.out.println("\n");
	 
	 a=b;
	 b=a;
	 
	 System.out.println("After Length of A =" + a.length);
	 System.out.println("After Length of B =" + b.length);
	 
	 for(int c:a)
	 {
		 System.out.println(c);
	 }
	 
	 for (int d:b)
	 {
		 System.out.println(d);
	 }
	 
	 
	}

}
