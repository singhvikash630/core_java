package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SvuidReceiver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fin=new FileInputStream("employee.ser");
		ObjectInputStream objin=new ObjectInputStream(fin);
		SvuidDog emp1=(SvuidDog)objin.readObject();

		System.out.println(emp1.x+"..."+emp1.y+"...."+emp1.z);
	}
	

}
