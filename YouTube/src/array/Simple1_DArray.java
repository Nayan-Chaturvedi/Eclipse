package array;



class Demo1DArray
{
	void array()
	{
	int age[]=new int[3];
	float []weight=new float[3];
	String name[]={"Nayan" ,"Raj" ,"Hariom"};
	
	
	age[0]=3;
	age[1]=4;
	age[2]=5;
	
	
	for (String string : name) 
	{
		System.out.println(string + " ");
	}
	
	for(int i:age)
	{
		System.out.println(i);
	}
	}
	
}

public class Simple1_DArray 
{

	public static void main(String[] args) 
	{
		Demo1DArray d=new Demo1DArray();
		d.array();

	}

}
