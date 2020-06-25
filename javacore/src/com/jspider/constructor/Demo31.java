package com.jspider.constructor;
class Demo31
{
    int x;
    int y;
	Demo31(int x,int y)
	{
		this.x=x;
		this.y=x;
	}
    Demo31()
    {
    this(-1,-1);
    }
}
class Demo32
{
    public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo31 d31=new Demo31();
		System.out.println("x="+d31.x);
		System.out.println("x="+d31.y);
		System.out.println("Program Ends");
	}
}
