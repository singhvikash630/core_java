package com.jspider.interfac;

//Multiple inheritance using one class & one interface 
interface IE
{
	void view();
}
class M
{
	void display()
	{
	System.out.println("Display class A method");
	}
}
class N extends M implements IE  
{
	public void view()
	{
    System.out.println("View() completed in class B");
    }
}
class Run3 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..");
		N b1=new N();
		b1.display();
		b1.view();
		System.out.println("Program Ends..");
	}
}
