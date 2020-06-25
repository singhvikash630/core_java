//Abstract Class
package com.jspider.abstractclass;
abstract class Demo11 
{
    abstract void show();
	void method()
	{
		System.out.println("inside Demo1's method");
	}
}

class Demo22 extends Demo11
{
	void show()
	{
		System.out.println("inside Demo2's show");
	}
	void method()
	{
	System.out.println("inside Demo2's method");
	}
}
class Runn
{
	public static void main(String[] args) 
	{
		Demo1 d1=new Demo2();//Dynamic method dispatch
        d1.show();
        d1.method();
	}
}
