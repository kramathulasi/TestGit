package com.logics;

public class FibanacciNumberSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//number series 0,1,1,2,3,5,8,13...n
		int n1=0;
		int n2=1;
		int sum = 0;
		int numberLimit = 20;
		System.out.print(n1+","+n2);
		/*for( int i=2; i<numberLimit;i++)
		{
			sum = n1+n2;
			System.out.print(","+sum);
			n1=n2;
			n2=sum;
		}*/
		while(sum < 20)
		{
			sum = n1+n2;
			n1 = n2;
			n2=sum;
			System.out.print(","+sum);
		}
	}

}
