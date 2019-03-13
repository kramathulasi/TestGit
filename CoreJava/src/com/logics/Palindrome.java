package com.logics;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 343;
		int temp = n;
		int sum =0,r = 0;
		
		while(n > 0)
		{
			r = n%10;
			System.out.println("r:"+r);
			sum= (sum*10)+r;
			System.out.println("sum:"+sum);
			n=n/10;
			System.out.println("n:"+n
					);
		}
		if(temp == sum)
		{
			System.out.println("Palindrome number:"+sum);
		}
		else{
			System.out.println("Not Palindrome::"+sum
					);
		}
		
		//print all palindrome numbers between 200  to 400
		for(int i=200; i<=400; i++)
		{
			int m=i;
			int temp1 = i;
			int sum1 =0;
			int r1=0;
			while(m > 0)
			{
				r1 = m%10;
				sum1 = (sum1*10)+r1;
				m = m/10;
			}
			if(temp1 == sum1)
			{
				System.out.println(sum1);
			}
		}
	}
	
}
