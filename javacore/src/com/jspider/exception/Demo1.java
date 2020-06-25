package com.jspider.exception;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		int i=10;
		int j=0;
	    j=i/10;
	    try
	    {
	    	System.out.println("inside try block");
	    	j=i/0;//abnormal statement or condition
	    	//throw ThrowableInstance;
		    System.out.println("existing try block");
	    }
	    catch(ArithmeticException a)
	    {
	    	System.out.println("running catch block");
	    }
	    System.out.println("value of i:"+i);
	    System.out.println("value of j:"+j);
		System.out.println("program ends");
		
	}

}
