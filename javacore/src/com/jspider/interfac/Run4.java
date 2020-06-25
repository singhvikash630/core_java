package com.jspider.interfac;

//Multiple inheritance using one class & two interface 
interface IF
{
	void view();
}
interface IC
{
	void print();
}

class O
{
	void display()
	{
	System.out.println("Display class A method");
	}
}
class P extends O implements IF,IC
{
	public void view()
	{
    System.out.println("View() completed in class B");
    }
	public void print()
		{
        System.out.println("Print() completed in class B");
        }
}
class Run4 
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts..");
		P b1=new P();
		b1.display();
		b1.view();
		b1.print();
		System.out.println("Program Ends..");
	}
}
