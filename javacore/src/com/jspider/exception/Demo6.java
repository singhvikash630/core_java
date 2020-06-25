
//Stack Unwinding

package com.jspider.exception;

public class Demo6 {

	
	public static void main(String[] args)
	{
		System.out.println("program starts");
		test1();
		System.out.println("program ends");
	}
	static void test1()
	{
		System.out.println("running test1()...");
		test2();
		System.out.println("stopping test1()..");
	}
	static void test2()
	{
		System.out.println("running test2()...");
		
			test3();
			
		System.out.println("stopping test2()..");
	}
	static void test3()
	{
		System.out.println("running test3()...");
		test4();
		System.out.println("stopping test3()..");
	}
	static void test4()
	{
		System.out.println("running test4()...");
		int i=10;
		try{
		int j=i/0;//abnormal statement
		}
		catch(Throwable e)
		{
			System.out.println("catch block");
		}
		System.out.println("stopping test4()..");
	}

}
