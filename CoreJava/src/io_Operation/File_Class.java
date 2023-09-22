package io_Operation;

import java.io.File;
import java.io.IOException;

public class File_Class {

	public static void main(String[] args) throws IOException 
	{
		// Creating File
		
		File f1=new File("PW.txt");
		System.out.println(f1.exists());
		
		f1.createNewFile();
		System.out.println(f1.exists());
		
		// Creating dir
		
		File f2=new File("Pw");
		System.out.println(f2.exists());
		
		f2.mkdir();
		System.out.println(f2.exists());

	}

}
