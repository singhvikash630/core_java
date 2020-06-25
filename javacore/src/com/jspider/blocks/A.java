package com.jspider.blocks;

public class A 
{
	A()
	{
		System.out.println("default constructor");
	}
	static
	{
		System.out.println("static block1");
	}
	
	{
		System.out.println("non static block1");
	}
	static
	{
		System.out.println("static block2");
	}
	{
		System.out.println("non static block2");
	}
	void test()
	{
		
		System.out.println("in the method");
	}
	public static void main(String[] args)
	{
		System.out.println("main method");
		A a1=new A();
		
		a1.test();
		
	}

}
