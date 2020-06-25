package com.jspider.finalkeyword;

//using final,we can't override,ininherited & variable will be constant
class A//can't inherit this class
{
	void print(int x)//can't override
	{
    System.out.println("Print the value of X="+x);
    }
}
class B extends A
{
	final int SIZE=10;//size will be constant.
 void print(int y)
	{
	super.print(10);
    System.out.println("Print the value of Y="+y);
    }
}
class Run 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		B b=new B();
		b.print(12);
		System.out.println("Program Ends");
	}
}
