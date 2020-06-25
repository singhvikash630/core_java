package com.jspider.overloading;
class Demo2
{
    void test1()
	{
	System.out.println("Test1() method of classA");
	}
}
class Demo3 extends Demo2
    {
    void test1(int a)
	{
	System.out.println("Test1(int) method of classA");
	}
}
class SubclassOverloadingDemo 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo3 d3=new Demo3();
		d3.test1();
		d3.test1(12);
		System.out.println("Program Ends");
	}
}
