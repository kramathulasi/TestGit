package com.threads;

public class WaitNotify {
	
	public static void main(String []args)
	{
	final Customer c=new Customer();  
	Thread t1 = new Thread(){  
	public void run(){c.withdraw(15000);}  
	};  
	Thread t2 = new Thread(){  
	public void run(){c.deposit(10000);}  
	};  
	  t1.start();
	  t2.start();
	}
}
	
	class Customer
	{  
		int amount=10000;  
		  
		synchronized void withdraw(int amount)
		{  
		System.out.println("going to withdraw...");  
		  
		if(this.amount<amount)
		{  
			System.out.println("Less balance; waiting for deposit...");  
			try{
				wait();
				}catch(Exception e){}  
		}  
		this.amount-=amount;  
		System.out.println("withdraw completed...");  
		}  
		  
		synchronized void deposit(int amount)
		{  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify();  
		}  
		}  
		  
