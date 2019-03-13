package com.string.examples;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome To Cisco";
		String str2 = "TCS";
		String str3 = "tcs";
		//str = str.concat(" Cisco");
		//System.out.println(str);
		char ch = str.charAt(0);
		//System.out.println(ch);
		int compare = str2.compareToIgnoreCase(str3);
		//System.out.println(compare);
		//System.out.println(str2 == str3);
		StringBuffer sbu=new StringBuffer("tcs");
		//System.out.println(str2.contentEquals(sbu));
		boolean endsWith = str.endsWith("Cisco"); //true
		System.out.println(endsWith);
		//String s="sb ddg sdfdf";
		//System.out.println(s.getBytes());
		//System.out.println(s.indexOf('d'));
		//System.out.println(s.lastIndexOf('d'));
		//String s = new String("Hello");
		//System.out.println(s);
		//System.out.println(s.intern());;
		System.out.println(str.matches("(.*)To(.*)"));//startswith and endswith
	}
}
 