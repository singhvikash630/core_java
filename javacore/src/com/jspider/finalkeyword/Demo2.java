package com.jspider.finalkeyword;

//using local variable
class Demo2 
{
	final int i=0;
	public static void main(String[] args) 
	{
		final int i;//local variable must initialized & in same line i.e.not mandatory
		i=10;
		System.out.println("Program Starts");
		System.out.println("i="+i);
		Demo2 d2=new Demo2();
		//d2.i=10;
		//i=20;//final variable can't be reinitialized
		System.out.println("i="+i);
		System.out.println("Program Ends");
	}
}
