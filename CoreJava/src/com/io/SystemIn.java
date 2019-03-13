package com.io;

import java.io.IOException;

public class SystemIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
				i = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//returns ASCII code of 1st character  
		System.out.println((char)i);//will print the character 
	}

}
