package com.exceptions;

public class ClassNotFoundException1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class loadedClass = Class.forName("com.test.Employee");
		}
		catch(ClassNotFoundException cn)
		{
			System.out.println("Class Not Found Exception");
		}
	} 
}
