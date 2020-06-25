package com.jspider.system;
class A
{
	void test()
	{
		System.out.println("class day");
	}
}
public class Demo
{
	//static A a1=new A();
	static Demo d1=new Demo();
	void test()
	{
		System.out.println("class day1");
	}
	public static void main(String asdffscad[]) 
	{
		//static Demo d2=new Demo();not allowed
		//Day.a1.test(); 
		Demo.d1.test();
		//test();
    }
}
