//multilevel inheritance,one interface & Two classes
package com.jspider.interfac;
interface IDemo3
{
	 void test1();
	 void test2();
	 }
abstract class F implements IDemo3
    {
     public void test1()
	{
     System.out.println("test1() impletented in class A");
    }
    abstract void test3();
}
class G extends F
 {
	public void test2()
	{
    System.out.println("test2() impletented in class B");
    }
    void test3()
	{
    System.out.println("test3() impletented in class B");
    }
}
class Run10
{
	public static void main(String[] args)
	{
	System.out.println("Program Starts");
	G b1=new G();
	b1.test1();
	b1.test2();
	b1.test3();
	System.out.println("Program Ends");
	}
}