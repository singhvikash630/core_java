//Inheritance,using private member
package com.jspider.inheritance;
class Demo9 
{
	private int i=10;
	void print()
	{
    System.out.println("print class Demo2");
    System.out.println("private member i="+i);

	}
}
	class Demo34 extends Demo9
	{
	int p=20;
	void display()
	{
    System.out.println("Display class Demo3");
	}
	}
	
class Run5
	{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo34 d3=new Demo34();
        //System.out.println("i="+d3.i);//can't access outside of the class,we can access through method of the class
		System.out.println("p="+d3.p);
		d3.print();
		d3.display();
		System.out.println("Program Ends");
	}
}
	