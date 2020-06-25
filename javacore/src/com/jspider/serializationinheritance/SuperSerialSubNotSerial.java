package com.jspider.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Human implements Serializable { 	  

	String gender="female";   

}

class Man extends Human {  
	 String name="ram";
} 
public class SuperSerialSubNotSerial {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Man man= new Man();
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(man);
		
		FileInputStream fileInputStream = new FileInputStream("emp.ser");  
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);  
		Man manout = (Man) inputStream.readObject(); 
		/* 
		 * Printing values from deserialized Man's object 
		 */  
		System.out.println("Printing value of Deserailized Man's instance :");  
		System.out.println("Gender: " + manout.gender);  		   
		System.out.println("Name: " + manout.name);  


	}

}
