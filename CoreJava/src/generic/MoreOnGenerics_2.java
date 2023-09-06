package generic;



class Gen<M>
{
	M obj;
	
	Gen(M obj)
	{
		this.obj=obj;
	}
	
	public void dis()
	{
		System.out.println(obj.getClass().getName());
	}
	
	public M getObj()
	{
		return obj;
	}
}
public class MoreOnGenerics_2 
{

	public static void main(String[] args)
	{
		Gen<Integer> g=new Gen<Integer>(10);  // Allow only int type data
		g.dis();
		System.out.println(g.getObj());
		
		
		System.out.println();
		
		Gen g1=new Gen("Nayan");
		g1.dis();
		System.out.println(g1.getObj());
		
		System.out.println();
		
		Gen g2=new Gen(25F);
		g2.dis();
		System.out.println(g2.getObj());
		
		System.out.println();
		
		Gen g3=new Gen(10l);
		g3.dis();
		System.out.println(g3.getObj());
	}

}
