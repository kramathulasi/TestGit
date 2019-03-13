package com.logics;

public class FindSecondBiggestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {2,8,4,6,1,30,26,40};
		//Find second largest number in array result should be 30
		int largest=array[0];
		int secondlargest = array[0];
		for(int i=0; i<array.length; i++)
		{
			if(array[i] > largest)
			{
				secondlargest = largest;
				largest = array[i];
			}
			else if(array[i] > secondlargest)
			{
				secondlargest = array[i];
			}
		}
		System.out.println(largest
				);
		System.out.println(secondlargest);
		
	}

}
