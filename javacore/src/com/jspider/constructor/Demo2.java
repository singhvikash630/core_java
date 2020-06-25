//using this() statement "without reference variable"
package com.jspider.constructor;
class Demo2 
{
	int i;int j;
	Demo2()
	{
     System.out.println("running default constructor");
	}
	Demo2(int i)
	{
	 this();//invoking constructor
     System.out.println("running int arg constructor");
	 this.i=i;
	}
	Demo2(int i,int j)
	{
	 this(12);//invoking single arg constructor
     System.out.println("running two arg constructor");
	 this.i=i;
	 this.j=j;
	}
}
	class run2
    {
	public static void main(String[] args) 
		{
	System.out.println("Program Starts");
	new Demo2(10,20);//invoking two arg constructor without reference variable
    System.out.println("i="+new Demo2(20,30).i);
    System.out.println("j="+new Demo2(40,50).j);
	System.out.println("Program Ends");
	}
}