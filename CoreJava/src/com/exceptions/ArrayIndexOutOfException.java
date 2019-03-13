package com.exceptions;

public class ArrayIndexOutOfException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar = new int[5];
		try{
			System.out.println(ar[10]);
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Array Index Out Of Bounds Exception");
		}
	}

}
