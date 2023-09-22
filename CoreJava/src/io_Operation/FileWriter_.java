package io_Operation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ 
{

	public static void main(String[] args) throws IOException 
	{
		File dir=new File("DIR");
		dir.mkdir();
		
		File f=new File(dir, "Hari.txt");
		f.createNewFile();
		
		FileWriter fw=new FileWriter(f,true);
		fw.write("Nayan");
		fw.write("\n");
		fw.write(65);
		fw.write("\n");
		//fw.write("Ajay");
		//fw.write("\n");
		
		char c[]= {'A', 'V'};
		fw.write(c);
		
		
		
		fw.close();
		
		
	}

}
