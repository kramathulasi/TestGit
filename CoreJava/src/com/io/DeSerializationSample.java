package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fi = null;
		ObjectInputStream o=null;
		try{
			fi = new FileInputStream("D:\\Cisco\\employee.txt");
			o = new ObjectInputStream(fi);
			Employee2 emp = (Employee2)o.readObject();
			System.out.println(emp.firstName);
		}
		catch(Exception e)
		{
			
		}
	}

}
