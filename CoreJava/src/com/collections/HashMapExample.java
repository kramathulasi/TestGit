package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {	
	public static void main(String []args)
	{
		try{
		Student s1= new Student("Rama",1);
		Student s2= new Student("Rama",1);
		Student s3= new Student("Rama",1);
		Map<Student,String> map=new HashMap<Student,String>();
		map.put(s1, "Hello");
		map.put(s2, "Hi");
		map.put(s3, "wel");
		for(Student s:map.keySet())
		{
			System.out.println(map.get(s));
		}
		
		}catch(Exception e)
		{
			
		}
	}
}

class Student
{
	private String name;
	private int id;
	
	public Student(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	@Override
	public int hashCode()
	{
		return this.id;
	}
	
	@Override
	
	public boolean equals(Object obj)
	{
		if(this == obj)
			return true;
		else
			if(obj == null || obj.getClass() != this.getClass()){
				return false;
			}
		Student s = (Student)obj;
		return (s.name.equals(this.name) && s.id == this.id);
	}
}
