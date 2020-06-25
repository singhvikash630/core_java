package com.jspider.interfac;

//Derived Typecasting,auto upcasting & Explicit Downcasting
abstract interface IDemo6
{
	int i=10;
	static int j=20;
	public void test1();
   abstract int test2();
}
class I implements IDemo6
{
	public void test1()
	{
	System.out.println("test1() method of class A");
	}
public int test2()
	{
	System.out.println("test2() method of class A");
	return 0;
	}
}
class J extends I
{
	public void test3()
	{
	System.out.println("test3() method of class B");
	}
}
class C extends J
{
	public void test4()
	{
	System.out.println("test4() method of class B");
	}
}

class Run12
{
public static void main(String[] args)
	{
	System.out.println("*********One level upcasting************");
	J b1=new C();
	b1.test1();
	b1.test2();
	b1.test3();
	//b1.test4();//can't access
	System.out.println("*********second level upcasting************");
	I a1=(I)b1;
	a1.test1();
	a1.test2();
	//a1.test3();//can't access
	//a1.test4();//can't access
	System.out.println("********third level upcasting************");
	IDemo6 d6=a1;
	d6.test1();
	d6.test2();
	//d6.test3();//can't access
	//d6.test4();//can't access
	System.out.println("********one level downcasting************");
	I c1=(I)d6;
	c1.test1();
	c1.test2();
	//c1.test3();//can't access
	//c1.test4();//can't access
	System.out.println("********second level downcasting************");
	J c2=(J)d6;
	c2.test1();
	c2.test2();
	c2.test3();
	//c2.test4();//can't access
	System.out.println("Program Ends");
	//C c3=(C)new B();
	//c3.test1();
	//c3.test2();
	//c3.test3();
	//c3.test4();//can't access
	

	
	
	
	
}
}

