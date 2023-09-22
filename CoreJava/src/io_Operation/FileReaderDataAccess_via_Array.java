package io_Operation;

import java.io.*;
import java.util.Scanner;


public class FileReaderDataAccess_via_Array 
{

	public static void main(String[] args) throws IOException
	{
		File dir= new File("D:\\SampleProject\\call.java");
		FileReader fr=new FileReader(dir);
		char[] ch=new char[(int)dir.length()];
		fr.read(ch);
		for(char c:ch)
		{
			System.out.print(c);
		}
		
	}

}
