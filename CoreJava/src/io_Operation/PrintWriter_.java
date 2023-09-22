package io_Operation;

import java.io.*;

public class PrintWriter_
{

	public static void main(String[] args) throws IOException 
	{
		File dir=new File("D:\\SampleProject\\C.java");
		FileWriter fw=new FileWriter(dir,true);
		PrintWriter pw=new PrintWriter(dir);
		pw.write("Naman");
		
		pw.write(65);
		char c[]= {'A', 'D'};
		pw.write(c);
		pw.println(21);
		pw.println("Gupta");
		pw.print(false);
		pw.flush();
	}

}
