package com.jspider.interfac;

//Multilevel Inheritance between two interface & one class
interface IDemo4
{
	void test1();
}
interface IDemo5 extends IDemo4
{
	void test2();
}
class H implements IDemo5
{
	public void test1()
	{
	System.out.println("test1() completed in class A");
	}
	public void test2()
	{
	System.out.println("test2() completed in class A");
	}
}
class Run11
{
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		IDemo4 a1=new H();
		a1.test1();
		//a1.test2();
        System.out.println("Program Ends");
	}
}
