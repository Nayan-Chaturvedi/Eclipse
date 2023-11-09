package io_Operation;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.Buffer;

public class CustomisedSerialVersionUID_3 {

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("D:\\SampleProject\\A.class");
		BufferedInputStream bis=new BufferedInputStream(fis);
		ObjectInputStream ois=new ObjectInputStream(bis);
		
		CustomisedSerialVersionUID_1 ob=(CustomisedSerialVersionUID_1)ois.readObject();
		System.out.println("Name : "+ob.getName());
		System.out.println("Age : " +ob.getAge());
	}

}
