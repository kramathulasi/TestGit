package com.logics;

public class PyramidModels {

	public static void main(String[] args) {
		printPattern(5);
	}
	/*
	1 
   2 2 
  3 3 3 
 4 4 4 4 
5 5 5 5 5 
	*/	 
	private static void printPattern(int rows) {
		for(int i=1;i<=rows; i++)
		{
			int numberOfWhiteSpaces = rows-i;
			printString(" ", numberOfWhiteSpaces);
			printString(i + " ", i);
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j=0; j<times; j++)
		{
			System.out.print(s);
		}
	}
	/*
5 5 5 5 5 
 4 4 4 4 
  3 3 3 
   2 2 
    1 
	 
	private static void printPattern(int rows) {
		for(int i=rows;i>=1; i--)
		{
			int numberOfWhiteSpaces = rows-i;
			printString(" ", numberOfWhiteSpaces);
			printString(i + " ", i);
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j=0; j<times; j++)
		{
			System.out.print(s);
		}
	}
	*/
	/*
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
		private static void printPattern(int rows) {
			for(int i=1;i<=rows; i++)
			{
				int numberOfWhiteSpaces = rows-i;
				printString(" ", numberOfWhiteSpaces);
				for(int x=1; x<=i; x++)
				{
					System.out.print(x+" ");
				}
				System.out.println("");
			}
		}
		
		private static void printString(String s, int times) {
			for(int j=0; j<times; j++)
			{
				System.out.print(s);
			}
		}
		*/
	/*
    5 4 3 2 1
      4 3 2 1
        3 2 1
          2 1
            1 

		private static void printPattern(int rows) {
			for(int i=rows; i>=1; i--)
			{
				int numberOfWhiteSpaces = rows-i;
				printString("  ", numberOfWhiteSpaces);
				for(int x=i; x>=1; x--)
				{
					System.out.print(x+" ");
				}
				System.out.println("");
			}
		}
		
		private static void printString(String s, int times) {
			for(int j=0; j<times; j++)
			{
				System.out.print(s);
			}
		}
		*/
	/*
	 * 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
	private static void printPattern(int rows) {
		for(int i=rows; i>=1; i--)
		{
			int numberOfWhiteSpaces = rows-i;
			printString("  ", numberOfWhiteSpaces);
			for(int x=i; x>=1; x--)
			{
				System.out.print(x+" ");
			}
			for(int y=2; y<=i; y++)
			{
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j=0; j<times; j++)
		{
			System.out.print(s);
		}
	}
	*/
	/*
	 * 
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
5 4 3 2 1 2 3 4 5 
  4 3 2 1 2 3 4 
    3 2 1 2 3 
      2 1 2 
        1 
	private static void printPattern(int rows) {
		for(int i=1; i<=rows; i++)
		{
			int numberOfWhiteSpaces = rows-i;
			printString("  ", numberOfWhiteSpaces);
			for(int x=i; x>=1; x--)
			{
				System.out.print(x+" ");
			}
			for(int y=2; y<=i; y++)
			{
				System.out.print(y+" ");
			}
			System.out.println("");
		}
		for(int i=rows-1; i>=1; i--)
		{
			int numberOfWhiteSpaces = rows-i;
			printString("  ", numberOfWhiteSpaces);
			for(int x=i; x>=1; x--)
			{
				System.out.print(x+" ");
			}
			for(int y=2; y<=i; y++)
			{
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
	
	private static void printString(String s, int times) {
		for(int j=0; j<times; j++)
		{
			System.out.print(s);
		}
	}
	*/
}
