package extra_;


class Animal
{
	Animal reproduce()
	{
		return new Animal();
	}
}

class Dog extends Animal
{
	Dog reproduce()
	{
		return new Dog();
	}
}
public class CovarientReturnType
{

	public static void main(String[] args)
	{
		Animal an=new Dog();
		Animal obj=an.reproduce();

	}

}
