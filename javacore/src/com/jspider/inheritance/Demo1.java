//Inheritance,subclass inherits only non-static member of superclass,static member is not inherited by subclass
package com.jspider.inheritance;
class Demo1 
{
	int i=10;
	static int j=10;
	void print()
	{
    System.out.println("print class Demo1");
	}
}
	class Demo22 extends Demo1
	{
	int p=20;
	void display()
	{
    System.out.println("Display class Demo2");
	}
	}
	class Run1
	{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo1 d1=new Demo1();
        System.out.println("i="+d1.i);
		d1.print();
        System.out.println("*****************************");
		Demo22 d2=new Demo22();
        System.out.println("p="+d2.p);
        System.out.println("i="+d2.i);
		d2.print();
		d2.display();
		System.out.println("*****************************");
		System.out.println("j="+d1.j);//print the static member
        System.out.println("Program Ends");
	}
}
	