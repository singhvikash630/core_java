package com.jspider.finalkeyword;

//using global variable either static or non static
class Demo3
{
	final static int i=10;
	//i=10;//static & non-static both should be final & must initialized in same line
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo3 d3=new Demo3();
		System.out.println("i="+i);
		//d3.i=20;//final global variable can't be reinitialized
        System.out.println("i="+d3.i);
		System.out.println("Program Ends");
	}
}
