package com.jspider.manualexception;

class InvalidNameException extends Exception{  
	InvalidNameException(String s){  
	  super(s);  
	 }  
	} 

public class ManualException 
{
	void test() throws InvalidNameException 
	{
		String name=null;
		if(name==null)
		{
		throw new InvalidNameException("Exception thrown manually");	
		}
		
	}
	void test1() throws InvalidNameException
	{
		test();
		try {
			test();
		} catch (Exception e) {
			System.out.println("vikash");
		}
	}
	public static void main(String[] args) throws InvalidNameException
	{
		ManualException a1=new ManualException();
		a1.test1();
	}

}
