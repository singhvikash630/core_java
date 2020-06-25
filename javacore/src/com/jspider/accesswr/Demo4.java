package com.jspider.accesswr;

class A
{
	private int i=10;
	int getValue()
	{
		return i;
	}
	void setValue(int i)
	{
		this.i=i;
	}
}
class Demo4
{
public static void main(String[] args)
{
System.out.println("program starts");
A d4=new A();
d4.setValue(12);
System.out.println("i="+d4.getValue());
System.out.println("program ends");
	
}	
}


