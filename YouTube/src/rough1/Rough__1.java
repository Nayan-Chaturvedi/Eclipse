package rough1;

import java.util.*;

class Gen<T>
{
	T obj;
	
	Gen(T obj)
	{
		this.obj=obj;
	}
	
	public void dis()
	{
		System.out.println(obj.getClass().getName());
	}
}
class Rough__1
{
	public static void main(String[] args)
	{
		Gen<Integer> g1=new Gen<>(10);
		g1.dis();
		
		Gen<String> g2=new Gen<>("Nayan");
		g2.dis();
		
	}
}