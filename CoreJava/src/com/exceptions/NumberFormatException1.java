package com.exceptions;

public class NumberFormatException1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		try{
			System.out.println(Integer.parseInt(str));
		}
		catch(NumberFormatException n)
		{
			System.out.println("Number Format Exception");
		}
	}

}
