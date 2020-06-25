package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable{
	String ename="sanu";
	String pwd="ram";
	int pin=500;
	private void writeObject(ObjectOutputStream oos) throws IOException
    {
		oos.defaultWriteObject();
		String epwd="123"+pwd;
		int apin=444 + pin;
		oos.writeObject(epwd);
		oos.writeInt(apin);

    }
	private void readObject(ObjectInputStream iis) throws ClassNotFoundException, IOException
    {      
		iis. defaultReadObject();
		String epwd=(String)iis. readObject();
		int pin=iis.readInt();
		pwd=epwd.substring(3);
		pin=pin-444;

    }
}


public class CustomizedSerializatonDemo {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fout=new FileOutputStream("employee.ser");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Account emp=new Account();
		objout.writeObject(emp);
		
		FileInputStream fin=new FileInputStream("employee.ser");
		ObjectInputStream objin=new ObjectInputStream(fin);
		Account emp1=(Account)objin.readObject();
		

		System.out.println(emp1.ename+"...."+emp1.pwd+"....."+emp1.pin);

	

	}

}
