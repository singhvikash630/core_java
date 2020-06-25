package com.jspider.exception;
public class Demo7 
{
public static void main(String[] args) 
{
	System.out.println("program starts....");
	int i=10;
	try
	{
		System.out.println("try block");
		i=20/0;
	    return;
	}
	catch(ArithmeticException e)
	{
		System.out.println("ruuning catch block");
		//i=30/0;
		//System.exit(0);
		
		//break;
		
		//return;
		System.gc();
	}
	finally
	{
		System.out.println("running finally block");
		i=40;
		//step whatever we have to do,thats compulsory
	}
	//System.out.println("i="+i);
	//System.out.println("");
	}
}
