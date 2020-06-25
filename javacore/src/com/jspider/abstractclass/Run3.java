//if abstract method is no available in a class then class can be abstarct.
//respect of inheritance
package com.jspider.abstractclass;
abstract class G
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
class H extends G
{
	void test2()
	{
	 System.out.println("test2() method of abstract class b");
	}
	void test1()
	{
     System.out.println("test1() method of abstract class B");
	}
}
 class Run3 
{
	public static void main(String[] args) 
	{

		System.out.println("Program Starts");
		H b1=new H();
		b1.test1();
		b1.test2();
		A.print();
		System.out.println("Program Ends");
	}
}
