
//we can catch the exception through RuntimeException ,Exception & Throwable class

package com.jspider.exception;

public class Demo4 {

	
	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		int i=10;
		int j=0;
		j=i/10;
		try
		{
			System.out.println("try block start");
		    j=i/0;
		    System.out.println("try block end");
		}
		catch(RuntimeException e)
		{
		System.out.println(e.getStackTrace());
		System.out.println("catch block");
		}
		catch(Exception e)
		{
		System.out.println(e.getStackTrace());
		System.out.println("catch block");
		}
		catch(Throwable e)
		{
		System.out.println(e.getStackTrace());
		System.out.println("catch block");
		}
		System.out.println("value of i:"+i);
		System.out.println("value of j:"+j);
	    System.out.println("program ends");
	}

}
