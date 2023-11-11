package rough__;

class Std<T>
{
	T obj;
	
	Std(T obj)
	{
		this.obj=obj;
	}
	
	public void prop()
	{
		System.out.println(obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}
}

public class Rough_1
{
	public static void main(String[] args) 
	{
		Std<String> s=new Std<String>("Nayan");
		s.prop();
		System.out.println(s.obj);
	}
}