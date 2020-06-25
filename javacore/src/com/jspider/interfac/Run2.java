package com.jspider.interfac;

//Multiple inheritance using two interfaces
interface IB
{
	void test1();
}
interface ID
{
	void test2();
}
class K implements IB,ID
{
	public void test1()
	{
	System.out.println("test1() completed in class A");
	}
	public void test2()
	{
	System.out.println("test2() completed in class B");
	}
}


class Run2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		K a1=new K();
		a1.test1();
		a1.test2();
        System.out.println("Program Ends");
	}
}
