package io_Operation;

import java.io.*;

class Student implements Serializable
{
	private int age;
	private String name;
	
	Student(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	
	public void dis()
	{
		System.out.println(name+" "+age);
	}
}
	

class Seriliztion_and_Deserelization  // BOTH SERILAZTION & DESERILIZATION OPERATION PERFORM ON SAME CLASS
{
	public static void main(String[] args)  throws Exception
	{
		
		// FILE TRANSFER CONSOLE TO DATABASE
	
//		Student std=new Student(32, "Vivek");
//		FileOutputStream fos=new FileOutputStream("D:\\SampleProject\\A.class");
//		BufferedOutputStream bos=new BufferedOutputStream(fos);
//		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
//		oos.writeObject(std);
//		oos.close();
		
		
		
		// FILE TRANSFER DATABASE TO CONSOLE
		
		FileInputStream fis=new FileInputStream("D:\\SampleProject\\A.class");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		Student st=(Student)ois.readObject();
		st.dis();
		
		
	}
}