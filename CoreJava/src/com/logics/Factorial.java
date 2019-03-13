package com.logics;

public class Factorial {
	public static int factorial(int num)
	{
		if(num == 0)
		{
			return 1;
		}
		else
		{
			return num*factorial(num-1);
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int val= factorial(num);
		System.out.println(val);
	}

}
