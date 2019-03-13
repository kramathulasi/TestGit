package com.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Read1GBUsingNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.nio.file.Files.readAllBytes()

		//Tested in Java 7, 8, 9. This was overall the fastest method. 
		//Reading a 1GB file was consistently just under 1 second.
		
		String fileName = "D:\\Cisco\\test1GB.txt";
	    File file = new File(fileName);
	 
	    
	    byte[] fileBytes;
	    try {
	    	fileBytes = Files.readAllBytes(file.toPath());
	    	char singleChar;
	    	for(byte b : fileBytes) 
	    	{
	    		singleChar = (char) b;
	    		System.out.print(singleChar);
	    	}
	    } catch (IOException e) {
		}
	}
}
