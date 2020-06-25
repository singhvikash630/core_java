package com.jspider.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Car implements Externalizable {
	//class Car implements Serializable {
	String name;
	transient int year;//no role of transient keyword 
	int price;

	/*
	 * mandatory public no-arg constructor
	 */
	public Car() { 
		System.out.println("child constructor"); 
	}


	/** 
	 * Mandatory writeExernal method. 
	 */
	public void writeExternal(ObjectOutput out) throws IOException  {
		out.writeObject(name);
		out.writeInt(year);
	}

	/** 
	 * Mandatory readExternal method. 
	 */
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		year = in.readInt();
	}
	
}

public class ExternalizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Car car = new Car();
		car.name="Mitsubishi";car.year=2009;car.price=1000;
		FileOutputStream fo = new FileOutputStream("abc.ser");
		ObjectOutputStream so = new ObjectOutputStream(fo);
		so.writeObject(car);

		FileInputStream fi = new FileInputStream("abc.ser");
		ObjectInputStream si = new ObjectInputStream(fi);  	    
		Car newCar = (Car) si.readObject();


		System.out.println("The original car is ");
		System.out.println(car.name+car.year+car.price);
		System.out.println("The new car is ");
		System.out.println(newCar.name+newCar.year+newCar.price);
	}
	


}
