package com.logics;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 153 = 1power3+5power3+3power3 = 153;
		int tmp = 153;
		int number = 153;
        int noOfDigits = String.valueOf(number).length();
        int sum = 0;
        int div = 0; 
        while(tmp > 0) 
        { 
            div = tmp % 10; 
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
            }
            sum += temp;
            tmp = tmp/10; 
        } 
        if(number == sum) {
            System.out.println(sum);
        } 

	}

}
