package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class ArrayListSample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<String>();
		al.add("Rama");
		al.add("Thulasi");
		System.out.println(al);
		al.add(1,"Yash");
		System.out.println(al);
		al.remove(0);
		System.out.println(al);
		
		System.out.println(al.contains("Yash"));
		al.set(1, "Vineel");
		
		//Iterating arraylist;
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			//al.add(2,"fgh"); throws concurrentModificationException
		}
		//Sorting arrayList elements
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		// Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println("N value using lambda::"+n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> 
        { 
        	if (n%2 == 0) 
        		System.out.println("Even number or not::"+n); 
        }
        ); 
        ArrayList<String> al1 = new ArrayList<String>();
        al1.add("rama");
        al1.add("thlasi");
        al1.add("jyo");
		al1.forEach(str -> System.out.println("Print string values using Lambda::"+str));
		al.clear();
		//System.out.println("after clearing al values:"+al);
		
		
	}
}

