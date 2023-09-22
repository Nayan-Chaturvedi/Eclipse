package io_Operation;

import java.io.File;
import java.io.IOException;

public class List_Method 
{
	public static void main(String[] args) throws IOException
	{
		File dir3=new File("DIRECTORY");
		dir3.mkdir();
		
		File file11=new File(dir3, "Abhay.txt");
		file11.createNewFile();
		
		File file22=new File("DIRECTORY", "Vivek.txt");
		file22.createNewFile();
		
		String name1[]=dir3.list();
		int count=0;
		for(String s: name1)
		{
			System.out.println(s);
			count++;
		}
		System.out.println(count);
		
		File dir4=new File("D:\\SampleProject");
		String name2[]= dir4.list();
		int count1=0;
		for(String ss:name2)
		{
			count1++;
		}
		System.out.println("Number of files available in D drive SampleProject folder are : " + count1);
		
		
		
		
	}
}
