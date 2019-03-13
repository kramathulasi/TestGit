package com.threads;

class A{
	void m1()
	{
		System.out.println("Parent Class");
	}
}
class B extends A{
	void m1()
	{
		System.out.println("Child Class");
	}
	void m2()
	{
		System.out.println("m2 ");
	}
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a = new B();
		B b1 = new B();
		A a1 = (A)b1;
		B b = (B)a;
		b.m1();
		b.m2();
	}
}
