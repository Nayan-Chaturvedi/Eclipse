package io_Operation;

import java.io.*;

public class BufferReader_
{

	public static void main(String[] args) throws IOException
	{
		File dir=new File("D:\\SampleProject\\arraydemo.java");
		FileReader fr=new FileReader(dir);
		BufferedReader br=new BufferedReader(fr);
		
		String s=br.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br.readLine();
		}
		
	}

}
