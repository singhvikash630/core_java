//if abstract method is no available in a class then class can be abstarct.
//respect of multilevel inheritance
package com.jspider.abstractclass;
abstract class A
{
	abstract void test2();
	abstract void test1();
	static void print()
	{
	 System.out.println("print() method of abstract class A");
	}
	
}
abstract class B extends A
{
	void test2()
	{
	 System.out.println("test2() method completed in class B");
	}
}
class C extends B
{
	void test1()
	{
	 System.out.println("test1() method completed in class C");
	}
}
 class Run4 
{
	public static void main(String[] args) 
	{

		System.out.println("Program Starts");
		C c1=new C();
		c1.test1();
		c1.test2();
		A.print();
		System.out.println("Program Ends");
	}
}
