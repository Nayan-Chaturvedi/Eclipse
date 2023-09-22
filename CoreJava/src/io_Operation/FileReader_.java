package io_Operation;

import java.io.*;

public class FileReader_ 
{
	public static void main(String[] args) throws IOException
	{
		File dirr=new File("DIR");
		File file=new File(dirr, "Hari.txt");
		
		FileReader fr=new FileReader(file);
		
		int a=fr.read();
		//System.out.println((char)a);
		
		while(a!=-1)
		{
			System.out.print(a+"...");
			System.out.println((char)a);
			a=fr.read();
		}
	}
}
