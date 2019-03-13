package com.exceptions;

public class NullpointerException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException ne)
		{
			System.out.println("NullPointer Exception::"+ne.getMessage());
		}

	}

}
