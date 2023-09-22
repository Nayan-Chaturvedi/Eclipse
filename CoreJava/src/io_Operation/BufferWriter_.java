package io_Operation;

import java.io.*;

public class BufferWriter_ 
{

	public static void main(String[] args) throws IOException
	{
		File dir=new File("D:\\SampleProject\\add.java");
		FileWriter fw=new FileWriter(dir,true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("abhay");
		bw.newLine();
		char c[]= {'2','A'};
		bw.write(c);
		bw.newLine();
		
		bw.close();

	}

}
