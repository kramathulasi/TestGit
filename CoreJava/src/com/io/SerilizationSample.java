package com.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerilizationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 emp = new Employee2();
		emp.firstName = "Vivekanand";
		emp.lastName = "Gautam";
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Cisco\\employee.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in employee.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

}
class Employee2 implements Serializable
{
   public String firstName;
   public String lastName;
   private static final long serialVersionUID = 5462223600l;
}
