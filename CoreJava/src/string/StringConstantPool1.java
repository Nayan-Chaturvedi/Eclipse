package string;

class DemoStringConstantPool
{
	void check()
	{
	String s1="Nayan";
	String s2="Nayan";
	
	String s3=new String("Amit");
	String s4=new String("Amit");
	
	System.out.println("In String Constant Pool = " + (s1==s2));
	System.out.println("In Heap area =  "+ (s3==s4));
		
		

	}

}

public class StringConstantPool1 {

	public static void main(String[] args) {
		
		DemoStringConstantPool DSC =new DemoStringConstantPool();
		DSC.check();
		
	}

}
