//wrapper class
package com.jspider.wrapperclass;
public class Demo1
{
	public static void main(String[] args)
	{
		System.out.println("program starts");
		int i=10;
		System.out.println("i="+i);
		System.out.println("************************");

		//autoboxing	
		Integer intobj2=null;                                 
		System.out.println("Intobj2 value="+intobj2);
		System.out.println("************************");
		Long l=(long)6.4;
		long p=l;
		System.out.println("p="+p);
		
		//boxing creation
		Integer intobj1=new Integer(i);                      
		System.out.println("Intobj1 value="+intobj1);
		System.out.println("************************");

		//unboxing
		int j=intobj1.intValue();
		System.out.println("j="+j);
		System.out.println("program ends");
	}
}
