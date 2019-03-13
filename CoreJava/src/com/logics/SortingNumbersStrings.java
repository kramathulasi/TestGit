package com.logics;

public class SortingNumbersStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorting values in ascending order

		int a[] = {1,6,39,50,20,24}; 
		int temp;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<
					a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("After sorting integer array values are");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

		String []nameArray = {"Thulasi","Vineel", "Yashvitha","RamiReddy","Premakumari"};
		for(int i=0; i<nameArray.length; i++)
		{
			for(int j=i+1; j<nameArray.length; j++)
			{
				if(nameArray[i].compareTo(nameArray[j]) > 0)
				{
					String temp1 = nameArray[i];
					nameArray[i] = nameArray[j];
					nameArray[j] = temp1;
				}
			}
		}

		System.out.println("After sorting Names in array values are");
		for(int i=0; i<nameArray.length; i++)
		{
			System.out.println(nameArray[i]);
		}
	}

}
