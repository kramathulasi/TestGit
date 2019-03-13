package com.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi = null;
		try {
		     File file = new File("D:\\Thulasi\\newfile.txt");
		     //read the file
		     fi=new FileInputStream(file);
		     //for fast read using the buffer array
		    // BufferedInputStream bi= new BufferedInputStream(fi);
		     //available() returns 0 when there are no more bytes
		     
		     while(fi.available() > 0)
		     {
		    	 System.out.print((char)fi.read());
		     }
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	         /* boolean fvar = file.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }*/
		     
	    	} catch (IOException | NumberFormatException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }
		catch(Exception e1)
		{
			
		}
		finally{
			try{
			if(fi != null)
			fi.close();
			}
			catch(Exception e)
			{
			}
		}
	}
}
