//Inheritance,using private member
package com.jspider.inheritance;
class Demo2 
{
	void print()
	{
    System.out.println("print class Demo2");
    }
}
	class Demo3 extends Demo2
	    {
			int x;
	    int print(int x)
	    {
         this.x=x;
        System.out.println("Display class Demo3");
		return 0;
	    }
	}
	
class Run2
	{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo3 d3=new Demo3();
        d3.print();
        d3.print(5);
        System.out.println("x="+d3.x);
		System.out.println("Program Ends");
	}
}
	