//Method Overriding,using "super" keyword

package com.jspider.overriding;
class Run 
{
	static void print(int x)
	{
	System.out.println("Super class x="+x);
	}
}
class Demo2 extends Run
	{
	static void print(int y)
	{
	//super.print(4);
	System.out.println("Sub class y="+y);//same signature(return type also).
	//return 0;
	}
	}
class Run1
{		
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..");
		Demo2 d1=new Demo2();//dynamic method dispatch
		d1.print(5);
		System.out.println("Program Ends..");
	}
}
