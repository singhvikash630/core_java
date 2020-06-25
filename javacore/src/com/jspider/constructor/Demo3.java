//using this() statement & instance initialized block"
package com.jspider.constructor;
class Demo3 
{
	int i;int j;
	Demo3()
	{
     System.out.println("running default constructor");
	}
	{
	 System.out.println("running IIB block");
	}
	Demo3(int i)
	{
	 this();//invoking constructor
     System.out.println("running int arg constructor");
	 this.i=i;
	}
	Demo3(int i,int j)
	{
	 this(12);//invoking single arg constructor
     System.out.println("running two arg constructor");
	 this.i=i;
	 this.j=j;
	}
}
	class run3
    {
	public static void main(String[] args) 
		{
	System.out.println("Program Starts");
	Demo3 d3=new Demo3(10,20);//invoking two arg constructor without reference variable
    System.out.println("i="+d3.i);
    System.out.println("j="+d3.j);
	System.out.println("Program Ends");
	}
}