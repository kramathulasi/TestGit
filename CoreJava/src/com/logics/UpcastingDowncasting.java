package com.logics;

class Super{
	public void show()
	{
		System.out.println("Super class method");
	}
}

class SubClass extends Super{
	public void show()
	{
		System.out.println("Subclass class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super sub = new SubClass(); // 
		sub.show();
		Super uper =(Super) new SubClass();//upcasting
		uper.show();
		SubClass up = (SubClass) sub;
		up.show();
	}

}
