package mutableString;

public class MoreOnMutable {

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("");
		
		System.out.println("Capacity = " + sb.capacity());

		 sb=new StringBuffer(25);
		 System.out.println("New capacity" + sb.capacity());
		 
		 StringBuffer sb1=new StringBuffer("qwertyuioplkjhgf");
		 sb1.append("absdmd");
		 System.out.println("sb1 new Capaciyy = "+ sb1.capacity());
		 System.out.println(sb1.length());
		 
		 StringBuffer s2=new StringBuffer("Nayan");
		 System.out.println("s2 capacity = " + s2.capacity());

	}

}
