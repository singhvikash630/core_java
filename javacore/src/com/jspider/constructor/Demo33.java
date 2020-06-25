package com.jspider.constructor;
class Demo33
{
	//this Keyword
    static int x;
	int y=5;
	Demo33()
	{
		System.out.println("Print Default Constructor");
	
	}
	Demo33(int x,int y)
	{
	 this.x=x;
	 this.y=y;
	}
	public static void main(String[] args) 
	{
		System.out.println("Program Stars");
        Demo33 d33=new Demo33();
		System.out.println("x="+d33.x);
		System.out.println("y="+d33.y);
       	Demo33 d34=new Demo33(3,5);
		System.out.println("x="+d34.x);
		System.out.println("y="+d34.y);
        System.out.println("Program Ends");
	}
}
