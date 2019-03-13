package com.logics;

public class StringSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Rakesh";
		String s2 = "Rakesh"; //s1 and s2 referencing to same object in Pool
		String s3 = "Rakesh".intern(); //s1 , s2 and s3 referencing to same object in Pool
		String s4 = new String("Rakesh"); //s4 creates in Heap and referencing to same in Heap
		String s5 = new String("Rakesh").intern(); //again s5 referencing to Literal in Pool so s1, s2, s3 and s5 are referncing to same object in Pool

		if ( s1 == s2 ){
		System.out.println("s1 and s2 are same"); // 1.
		}

		if ( s1 == s3 ){
		System.out.println("s1 and s3 are same" ); // 2.
		}

		if ( s1 == s4 ){
		System.out.println("s1 and s4 are same"); // 3.
		}

		if ( s1 == s5 ){
		System.out.println("s1 and s5 are same" ); // 4.
		}
		StringBuffer sb=new StringBuffer("ab");

		StringBuffer sb1=new StringBuffer("ab");
		System.out.println(sb==sb1 ); // 4.
		String str2 = new String("abc").intern();

		String str1 = "abc";

		System.out.println("value = " + str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println("****************");
		String s="Sachin";  
		   String s6="Sachin";  
		   String s7="Ratan";  
		   System.out.println(s.compareTo(s6));//0  
		   System.out.println(s.compareTo(s7));//1(because s1>s3)  
		   System.out.println(s7.compareTo(s));//-1(because s3 < s1 )  
		
		}

}
