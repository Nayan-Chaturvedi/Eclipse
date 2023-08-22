package rough;

class Generic<T>
{
	T obj;
	
	public Generic(T obj)
	{
		this.obj=obj;
	}
	
	public void display()
	{
		System.out.println(obj.getClass().getName());
	}
	
	public T getData()
	{
		return obj;
	}
	
}

public class CollectionClass
{
	public static void main(String[] args) 
	{
		Generic g=new Generic('A');
		
		g.display();
		System.out.println(g.getData());
	}
}