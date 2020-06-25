
package com.jspider.manualexception;
import java.util.*;

public class A 
{
	void test() throws Exception 
	{
		String name=null;
		if(name==null)
		{
		throw new Exception("Exception thrown manually");	
		}
		
	}
	void test1() throws Exception
	{
		test();
		try {
			test();
		} catch (Exception e) {
			System.out.println("vikash");
		}
	}
	public static void main(String[] args) throws Exception 
	{
		A a1=new A();
		a1.test1();
	}

}
