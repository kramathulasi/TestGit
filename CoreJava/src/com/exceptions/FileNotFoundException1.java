package com.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
public class FileNotFoundException1 {

	public static void main(String[] args) {
		try{
			File file = new File("sample.txt");
			FileInputStream fi = new FileInputStream(file);
		}
		catch(FileNotFoundException f)
		{
			f.printStackTrace();
			System.out.println("File not Found Exception");
			StringWriter sw = new StringWriter();
		    f.printStackTrace(new PrintWriter(sw));
			System.out.println(sw.toString());
			System.out.println(f);
			System.out.println(Arrays.toString(f.getStackTrace()));
			
		}
	}
}
