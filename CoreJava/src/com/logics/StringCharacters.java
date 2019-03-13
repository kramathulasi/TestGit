package com.logics;

public class StringCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abdfehjklaed".toLowerCase();
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				System.out.println("Vowels are ::"+str.charAt(i));
			}
		}
		
		for(int i=str.length()-1; i>=0; i--)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
			{
				//System.out.println("Vowels are ::"+str.charAt(i));
			}
			System.out.print(str.charAt(i));
		}
	}
}
