package com.jspider.overriding;
class B
{
	void print1() throws Throwable
	{
	System.out.println("Super class x=");
	}	
}

public class A extends B {

	 void print1() throws Exception
	{
	System.out.println("Super class y=");
	}
	public static void main(String[] args) throws Exception {
	A a1=new A();
	a1.print1();
	//a1.print2();

	}

}
