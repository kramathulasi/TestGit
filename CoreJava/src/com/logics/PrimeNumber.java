package com.logics;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num = 29;
		boolean flag = false;
		for(int i=2; i<=num/2;i++)
		{
			if(num%i == 0)
			{
				flag = true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("Prime Number:"+num);
		}
		//Display prime number between 1 to 100m
		
		for(int j=1;j<=100; j++)
		{
			int n=j;
			boolean isDivisible = false;
			for(int k=2;k<=n/2;k++)
			{
				if(n%k == 0)
				{
					isDivisible= true;
					break;
				}
			}
			if(!isDivisible)
			{
				System.out.println("Prime Number is :"+n);
			}
			
			
			
		}

	}

}
