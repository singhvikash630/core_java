//use of super() statement,calls default constructor & arg constructor
package com.jspider.inheritance;
class Demo8
{
	int i;int j;
	Demo8()
	{
	super();//default constructor provides by compiler
	System.out.println("Running Default Constructor of class Demo4");
	}
}
class Demo5 extends Demo8
{
Demo5(int i,int j)
	{
	super();//default constructor provides by compiler
	//super();//default constructor provides by compiler,not allowed in 2nd line
	System.out.println("Running Default Constructor of Class Demo5");
	this.i=i;
	this.j=j;
	}
}
class Demo6 extends Demo5
{
Demo6(int i)
	{
	super(1,2);//default constructor provides by compiler
	System.out.println("Running Default Constructor of Class Demo6");
     this.i=i;
	}
}
class Run
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo6 d6=new Demo6(12);
		System.out.println("i="+d6.i);
		System.out.println("j="+d6.j);
		System.out.println("Program Ends");
	}
}
