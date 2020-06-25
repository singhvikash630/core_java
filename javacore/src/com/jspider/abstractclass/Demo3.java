//concrete class,concrete mehod & abstract class,abstract method
//if abstract class is available in a class then that class must be abstract.
//respect of class
package com.jspider.abstractclass;
abstract class Demo3
{
	void test1()
	{
		//concrete method or complete method
	}
	abstract void test2();//abstract method or incomplete method
}
class Run 
{
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//A a1=new A();//can't create an object of abstract class
		System.out.println("Program Ends");
	}
}
