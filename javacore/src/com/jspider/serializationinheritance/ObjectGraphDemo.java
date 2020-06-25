package com.jspider.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Rat implements Serializable{}
class Cat implements Serializable{
	Rat r=new Rat();
}
class Dog implements Serializable {
	Cat c=new Cat();


}
public class ObjectGraphDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fout=new FileOutputStream("employee.ser");
		ObjectOutputStream objout=new ObjectOutputStream(fout);
		Dog emp=new Dog();
		objout.writeObject(emp);
	}
}
