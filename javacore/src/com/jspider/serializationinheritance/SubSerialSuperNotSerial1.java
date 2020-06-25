package com.jspider.serializationinheritance;
import java.io.*;

class ParentNonSerializable
{
	int noOfWheels;
	ParentNonSerializable(){
		this.noOfWheels=4;
	}


}

class ChildSerializable extends ParentNonSerializable implements Serializable
{

	private static final long serialVersionUID = 1L; 
	String color; 
	ChildSerializable() { 
		this.noOfWheels = 8; 
		this.color = "blue"; 
	} 
}

public class SubSerialSuperNotSerial1 {
	public static void main(String[] args) {

		ChildSerializable c = new ChildSerializable(); 
		System.out.println("Before : -  " +  c.noOfWheels + " "+ c.color);
		try { 
			FileOutputStream fs = new FileOutputStream("employee.ser"); 
			ObjectOutputStream os = new ObjectOutputStream(fs); 
			os.writeObject(c); 
			os.close(); 
		} catch (Exception e) {  e.printStackTrace(); } 
		try { 
			FileInputStream fis = new FileInputStream("employee.ser"); 
			ObjectInputStream ois = new ObjectInputStream(fis);  
			c = (ChildSerializable) ois.readObject(); 
			ois.close(); 
		} catch (Exception e) {  e.printStackTrace(); } 
		System.out.println("After :-  " +  c.noOfWheels + " "+ c.color); 
	} 
}



