package com.jspider.interfac;

interface Area
{
	final float pi=3.142f;//constant value
	double area(int x,int y);
	void show();
}
class Rectangle implements Area
{
	double z;
	public double area(int x,int y)
	{
	z=x*y;
	return z;
	}
	public void show()
	{
	System.out.println("Area of rectangle="+z);
	}
}
class Circle implements Area
{
	double a;
	public double area(int x,int y)
	{
	a=pi*x*x;
	return a;
	}
	public void show()
	{
	System.out.println("Area of Circle="+a);
	}
	}
	class Run
	{
		public static void main(String[] args) 
	{
			System.out.println("Program Starts");
			Area r=new Rectangle();
			r.area(3,5);
			r.show();
			Area c=new Circle();
			c.area(4,5);
			c.show();
		System.out.println("Program Ends");
	}
}
