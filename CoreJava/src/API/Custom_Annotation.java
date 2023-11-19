package API;

import java.lang.annotation.*;

@Target(ElementType.TYPE )
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	int age() default(20);
}
@CricketPlayer
class Player
{
	String name="Nayan";
	
	public void dis()
	{
		System.out.println("In Player Class");
	}
}

class Custom_Annotation
{
	public static void main(String[] args) 
	{
		Player p=new Player();
		p.dis();
		
		Class cls=p.getClass();
		Annotation ano=cls.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer)ano;
		System.out.println(cp.age());
		
	}
}