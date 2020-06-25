package com.jspider.overriding;
//using overloading,overriding & super keyword
class A
{
	Object print(int x) 
	{
    System.out.println("Print the value of X="+x);
	return null;
    }
}
class B extends A
{
 A  print(int y)
	{
	//super.print(10);
    System.out.println("Print the value of Y="+y);
	return null;
    }
 void print(int y,int x)
	{
	System.out.println("Print the value of x="+x);
	System.out.println("Print the value of y="+y);
    }
}
class Run2 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		B b=new B();
		b.print(12);
		b.print(3,5);
		System.out.println("Program Ends");
	}
}
