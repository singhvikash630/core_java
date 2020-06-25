package com.jspider.exception;

public class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		int i=10;
		int j=0;
		int[] array=new int[5];
		try
	    {
	    	System.out.println("outer try block");
	    	try{
	    		System.out.println("inner try block");
	    	   	j=i/0;//abnormal statement or condition
		    System.out.println("existing inner try block");
	        }
	    	catch(ArithmeticException a)
		    {
		    	System.out.println("running 1nd catch block");
		    }
	    	array[5]=17;
	    	System.out.println("existing outer try block");
	         }
	    
	    catch(ArrayIndexOutOfBoundsException a)
	    {
	    	System.out.println("running 2nd catch block");
	    }
	    
	    System.out.println("value of i:"+i);
	    System.out.println("value of j:"+j);
	    System.out.println("program ends");
		
	}

}
