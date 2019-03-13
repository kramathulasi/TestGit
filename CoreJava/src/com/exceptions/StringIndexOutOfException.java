package com.exceptions;

public class StringIndexOutOfException {

	public static void main(String[] args) {
		String str = "abcdefgh";
		try{
			char ch= str.charAt(20);
		}
		catch(StringIndexOutOfBoundsException so)
		{
			System.out.println("StringIndex Out Of Bounds Exception");
		}
		
	}

}
