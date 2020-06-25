package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationDemo2 {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException 
	{
		System.out.println("program starts");
		FileInputStream fin=new FileInputStream("employee.ser");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp=(Employee)objin.readObject();
		emp.empdetails();
		System.out.println("program ends");
			}

}
