package com.jspider.exception;

public class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		int i=10;
		int j=0;
		int[] array=new int[5];
		try
	    {
	    	System.out.println("inside try block");
	    	array[5]=17;
	    	j=i/0;//abnormal statement or condition
		    System.out.println("existing try block");
	    }
	    catch(ArrayIndexOutOfBoundsException a)
	    {
	    	System.out.println("running 1st catch block");
	    }
	    catch(ArithmeticException a)
	    {
	    	System.out.println("running 2nd catch block");
	    }
	    System.out.println("value of i:"+i);
	    System.out.println("value of j:"+j);
	    System.out.println(array);
		System.out.println("program ends");
		
	}

}
