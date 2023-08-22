package generic;

class Gen<T>
{
	T obj;
	
	public Gen(T obj)
	{
		this.obj=obj;
	}
	
	void disply()
	{
		System.out.println("Type of Data : " + obj.getClass().getName());
	}
	
	public T getObj()
	{
		
		return obj;
	}
}
public class Lecture212_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<Integer> g1=new Gen<Integer>(10);
		
		g1.disply();
		
		System.out.println(g1.getObj());
		
		System.out.println("******");
		
		Gen<String> g2 =new Gen<String>("Nayan");
		
		g2.disply();
		System.out.println(g2.getObj());
	}

}
