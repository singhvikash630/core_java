//Multilevel Inheritance,using static member
package com.jspider.inheritance;
class Demo7 
{
	int i=10;
	static int j=50;
	void print()
	{
    System.out.println("print class Demo2");
	}
}
	class Demo33 extends Demo7
	{
	int p=20;
	void display()
	{
    System.out.println("Display class Demo3");
	}
	}
	class Demo4 extends Demo33
	{
	int x=30;
	void view()
	{
    System.out.println("View class Demo4");
	}
	}
	class Run8
	{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo4 d4=new Demo4();
        System.out.println("i="+d4.i);
		System.out.println("p="+d4.p);
		System.out.println("x="+d4.x);
		d4.print();
		d4.display();
		d4.display();
		//System.out.println("j="+j);
		System.out.println("Program Ends");
	}
}
	