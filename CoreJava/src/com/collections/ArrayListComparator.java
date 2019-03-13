package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorting for ArrayList with custom objects
				ArrayList<Employee1> al = new ArrayList<Employee1>();
				al.add(new Employee1(5,"Rama"));
				al.add(new Employee1(2,"Yash"));
				al.add(new Employee1(1,"Bhagya"));
				al.add(new Employee1(3,"Arpitha"));
				al.add(new Employee1(4,"Prathyu"));
				// System.out.println(Collections.sort(al)); Throws Compiler Exception since Employee object is not implemented Comparable interface
				Collections.sort(al,new EmpIdComparator());
				System.out.println(al.toString());
	}

}

class Employee1
{
	private String empName;
	private int empId;
	Employee1(int empId,String empName)
	{
		this.empName = empName;
		this.empId = empId;
	}
	public void setEmpName(String empName)
	{
		this.empName = empName;
	}
	public void setEmpId(int empId)
	{
		this.empId = empId;
	}
	public String getEmpName()
	{
		return empName;
	}
	public int getEmpId()
	{
		return empId;
	}
	
	public String toString()
	{
		return "[EmpId::"+empId+" ~EmpName:"+empName+"]";
	}
}

class NameComparator implements Comparator<Employee1>
{
	public int compare(Employee1 o1, Employee1 o2)
	{
		return o1.getEmpName().compareTo(o2.getEmpName());
	}
}	
	
class EmpIdComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Employee1 e1=(Employee1)o1;
		Employee1 e2 = (Employee1)o2;
		
		return e1.getEmpId()-e2.getEmpId();
	}
}
