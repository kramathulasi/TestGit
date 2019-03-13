package com.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class AppendContentToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			file = new File("D:\\Thulasi\\newfile.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			fw = new FileWriter(file,true);
			String data="Hello Thulasi";
			fw.write(data);
			fw.flush();
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
				if(fw != null)
					fw.close();
			}
			catch(Exception e)
			{
				
			}
		}

	}

}
