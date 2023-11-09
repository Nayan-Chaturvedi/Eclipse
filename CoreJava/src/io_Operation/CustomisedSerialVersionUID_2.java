package io_Operation;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CustomisedSerialVersionUID_2
{

	public static void main(String[] args) throws IOException
	{
		CustomisedSerialVersionUID_1 obj=new CustomisedSerialVersionUID_1("Nayan", 99);
		
		FileOutputStream fos=new FileOutputStream("D:\\SampleProject\\A.class");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		
		oos.writeObject(obj);
		oos.close();
		

	}

}
