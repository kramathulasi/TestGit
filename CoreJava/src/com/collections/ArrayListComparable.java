package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Sorting for ArrayList with custom objects
				ArrayList<Employee> al = new ArrayList<Employee>();
				al.add(new Employee(5,"Rama"));
				al.add(new Employee(2,"Yash"));
				al.add(new Employee(1,"Bhagya"));
				al.add(new Employee(3,"Arpitha"));
				al.add(new Employee(4,"Prathyu"));
				// System.out.println(Collections.sort(al)); Throws Compiler Exception since Employee object is not implemented Comparable interface
				Collections.sort(al);
				System.out.println(al);
	}

}

class Employee implements Comparable<Employee>
{
	private String empName;
	private int empId;
	Employee(int empId,String empName)
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
	@Override
	public int compareTo(Employee e)
	{
		/* For Ascending order*/
		return this.empId - e.getEmpId();
        /* For Descending order do like this */
        //return empId-e.getEmpId();
	}
	@Override
	public String toString()
	{
		return "[EmpId::"+empId+" ~EmpName:"+empName+"]";
	}
}