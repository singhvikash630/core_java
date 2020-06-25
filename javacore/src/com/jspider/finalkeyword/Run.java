package com.jspider.finalkeyword;

interface Demo1
{
	void test1();
	
}
class Demo7 implements Demo1
{
	public void test1()
	{
	System.out.println("test1() method in Demo5");
	}
}
class Run2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo1 d1=new Demo7();//Dynamic method dispatch
		d1.test1();
		System.out.println("Program Ends");
	}
}
