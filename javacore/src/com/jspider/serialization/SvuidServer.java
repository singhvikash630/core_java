package com.jspider.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SvuidServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("employee.ser");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		SvuidDog emp=new SvuidDog();
		emp.x=10;emp.y=20;
		objout.writeObject(emp);

	}

}
