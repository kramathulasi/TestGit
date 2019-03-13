package com.exceptions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListTooLargeException extends RuntimeException
{
	public ListTooLargeException(String errorMessage)
	{
		super(errorMessage);
	}
}
public class UnCheckedException {
	public static void data(List<String> list)
	{
		if(list.size() > 50)
		{
			throw new ListTooLargeException("List can't exceed 50 items!");
		}
	}
	
	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al = Collections.nCopies(100, "Thulasi");
		data(al);
	}
}
