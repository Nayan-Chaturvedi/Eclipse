package rough__;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Scanner;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
	 int num() default(20);
}

@CricketPlayer
class Player
{
	
	private int serialNum;
	private String name;
	
	public void playerInf()
	{
		serialNum=101;
		name="Sachin";
		
		System.out.println("Serial Num : "+serialNum+"| Name : "+name);
	}
}
public class Rough_1
{
	public static void main(String[] args) 
	{
		Player p=new Player();
		p.playerInf();
		Class cls=p.getClass();
		Annotation ano=cls.getAnnotation(CricketPlayer.class);
		CricketPlayer cp=(CricketPlayer) ano;
		System.out.println("Age : "+cp.num());
	}
}