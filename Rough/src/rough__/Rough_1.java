package rough__;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialNum implements Serializable
{
	//public static final long serialVersionUID=1212L;
	transient final private int age=10;
	private String name;
	
//	public void setAge(int age)
//	{
//		this.age=age;
//	}
//	
//	public int getAge()
//	{
//		return age;
//	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "Serial_Number [ age : "+age +"| Name : "+name +" ]";
	}
	
	public void play()
	{
		System.out.println("Hi... I'm Nayan");
	}
}

public class Rough_1 
{
	 public static void main(String args[]) throws Exception 
	 {
//		 SerialNum sn=new SerialNum();
//		// sn.setAge(23);
//		 sn.setName("Priya");
//		 System.out.println(sn);
//		 
//		 FileOutputStream fos=new FileOutputStream("D:\\Rough\\itr.Java");
//		 BufferedOutputStream bos=new BufferedOutputStream(fos);
//		 ObjectOutputStream oos=new ObjectOutputStream(bos);
//		 
//		 oos.writeObject(sn);
//		 oos.close();
//		 
//		 System.out.println(sn);
		 
		 
		 FileInputStream fis=new FileInputStream("D:\\Rough\\itr.Java");
		 BufferedInputStream bis=new BufferedInputStream(fis);
		 ObjectInputStream ois=new ObjectInputStream(bis);
//		 Object obj=ois.readObject();
		 SerialNum sn=(SerialNum) ois.readObject();
		 sn.play();
		 System.out.println(sn);
		 
	

	 }
}