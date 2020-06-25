//Inheritance ,respect of inheritance
package com.jspider.interfac;
interface IDemo2
{
	 void test1();
	 void test2();
	 void test3();
}
class D implements IDemo2
{
 public void test1()
	{
 System.out.println("test1() impletented in class A");
 }
 public void test2()
	{
 System.out.println("test2() impletented in class A");
 }
 public void test3()
	{
 System.out.println("test3() impletented in class A");
 }
}
class Run9
{
	public static void main(String[] args)
	{
	System.out.println("Program Starts");
	D a1=new D();
	a1.test1();
	a1.test2();
	a1.test3();
	System.out.println("Program Ends");
	}
}