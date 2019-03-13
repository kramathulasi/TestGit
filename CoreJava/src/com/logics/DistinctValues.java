package com.logics;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctValues {

	public static void main(String[] args) {
		int a[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}; 
		int n = a.length;  
		int flag = 0, count = 0;
		//printing non duplicated elements from Array
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				if(i != j)
				{
					if(a[i] != a[j])
					{
						flag = 1;
					}
					else
					{
						flag = 0;
						break;
					}
				}
			}
			if(flag == 1)
			{
				count++;
				System.out.println(a[i]+" ");
			}
		} 
		//out put ::: 5 9 120 
		//Print Duplicate elements
		int ar[] = {6, 10, 5, 4, 9, 120, 4, 6, 10};
		HashSet<Integer> hs= new HashSet<Integer>();
		for(int i=0; i<ar.length; i++)
		{
			if(!hs.contains(ar[i]))
			{
				hs.add(ar[i]);
			}
			else{
				System.out.println(ar[i]);
			}
		}
	} 
}
