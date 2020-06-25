//using this() statement
package com.jspider.constructor;
class Demo1 
{
	int i;int j;
	Demo1()
	{
     System.out.println("running default constructor");
	}
	Demo1(int i)
	{
	 this();//invoking constructor
     System.out.println("running int arg constructor");
	 this.i=i;
	}
	Demo1(int i,int j)
	{
	 this(12);//invoking single arg constructor
     System.out.println("running two arg constructor");
	 this.i=i;
	 this.j=j;
	}
}
	class run1
    {
	public static void main(String[] args) 
		{
	System.out.println("Program Starts");
	Demo1 d1=new Demo1(10,20);//invoking two arg constructor
    System.out.println("i="+d1.i);
    System.out.println("j="+d1.j);
	System.out.println("Program Ends");
	}
}
