package extra_;

class ab
{
	private String name;
	private int age;
	
	ab(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public String toString()
	{
		return name +" " +age;
	}
}
public class ToStringMethod {

	public static void main(String[] args) 
	{
		ab a= new ab("Amit", 22);
		
		System.out.println(a);

	}

}
