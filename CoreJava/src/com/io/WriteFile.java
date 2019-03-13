package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		File file = null;
		FileOutputStream fo = null;
		try{
			file = new File("D:\\Thulasi\\newfile.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			fo = new FileOutputStream(file);
			String data="Hello Thulasi";
			byte[] b = data.getBytes();
			fo.write(b);
			fo.flush();
		}
		catch(IOException e)
		{
			
		}
		finally
		{
			try
			{
				if(fo != null)
					fo.close();
			}
			catch(Exception e)
			{
				
			}
		}
	}

}
