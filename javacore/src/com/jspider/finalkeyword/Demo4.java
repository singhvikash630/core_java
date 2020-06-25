package com.jspider.finalkeyword;

class Demo4
{
	final void test1()
	{
	System.out.println("test1() method in Demo4");
	}
}
//can't inherit final class
class Demo9 extends Demo4
{
	//can't override final method of superclass
	/*void test1()
	{
	System.out.println("test1() method in Demo5");
	}*/
}
class Run8
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		//Demo4 d4=new Demo5();//Dynamic method dispatch
		//d4.test1();
		System.out.println("Program Ends");
	}
}
