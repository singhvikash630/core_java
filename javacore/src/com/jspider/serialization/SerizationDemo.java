package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	int empid;
	transient int x;//-----0
	transient static int  j=10;//-------10
	transient final int h =10;//-------10
	String ename;
	double empsal;
	Employee(int empid,String ename,double empsal)
	{
		this.empid=empid;
		this.ename=ename;
		this.empsal=empsal;
	}
	void empdetails()
	{
		System.out.println("emp id is="+empid);
		System.out.println("empname is="+ename);
		System.out.println("empsal is="+empsal);
	}
}

public class SerizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		System.out.println("program starts");
		System.out.println("*****Serialization*************");
		FileOutputStream fout=new FileOutputStream("employee.ser");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Employee emp=new Employee(10,"vikash",28000.00);
		objout.writeObject(emp);
		System.out.println("*****DeSerialization*************");
		FileInputStream fin=new FileInputStream("employee.ser");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Employee emp1=(Employee)objin.readObject();
		emp1.empdetails();

		System.out.println("program ends");

	}

}
