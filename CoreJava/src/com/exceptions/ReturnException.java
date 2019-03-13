package com.exceptions;

public class ReturnException {
	public static void main(String[] args) {
		System.out.println(riskyAction());
	}
	public static String riskyAction(){
		try{
			System.out.println("Started executing try block");
//			return "returning from try block";
			throw new Exception();
		}catch(Exception e){
			System.out.println("print statement from catch");
			return "return from catch";
		}finally{
			try{
				System.out.println("print statement from finally try");
				throw new Exception();
			}
			catch(Exception e)
			{
				System.out.println("print statement from finally catch");
				return "return from finally catch";
			}
		}
	}
}
