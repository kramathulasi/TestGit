package com.exceptions;

public class ArithmeticException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			int i=10/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Arithematic Exception");
		}

	}

}
