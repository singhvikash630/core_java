//if abstract method is no available in a class then class can be abstarct. 
//respect of class
package com.jspider.abstractclass;
abstract class D
{
	abstract void test2();
	void test1()
	{
     System.out.println("test1() method of abstract class A");
	}
	static void print()
	{
	 System.out.println("print() method of abstract class A");
	}
	
}
 class Run1 
{
	public static void main(String[] args) 
	{

		System.out.println("Program Starts");
		A.print();
		System.out.println("Program Ends");
	}
}
