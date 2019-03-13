package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi = null;
		FileReader fr = null;
		try 
		{
		     File file = new File("D:\\Thulasi\\newfile.txt");
		     /*//read the file
		     fi=new FileInputStream(file);
		     //for fast read using the buffer array
		    // BufferedInputStream bi= new BufferedInputStream(fi);
		     //available() returns 0 when there are no more bytes
		     while(fi.available() > 0)
		     {
		    	 System.out.print((char)fi.read());
		     }*/	    	
		      fr = new FileReader(file);
		      int i=fr.read();
		      while(i != -1)
		      {		    	 
		    	  System.out.print((char)i);
		      }
		    } 
		catch (IOException e) 
		 {
	    	System.out.println("Exception Occurred:");
		    e.printStackTrace();
		 }
		finally
		{
			try
			{
				if(fi != null)
					fi.close();
			}
			catch(Exception e)
			{
				
			}
		}

	}
}
