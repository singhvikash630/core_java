//Interface using variable methods
package com.jspider.interfac;
interface IDemo1
{
	int i=0;
    void test1();
}
class E implements IDemo1
{
 public void test1()
	{
 System.out.println("test1() impletented in class A");
 }
}
class Run7
{
	public static void main(String[] args)
	{
	System.out.println("Program Starts");
	E a1=new E();
	a1.test1();
	System.out.println("Program Ends");
	}
}