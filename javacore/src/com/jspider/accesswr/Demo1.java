//access methods without using reference variable
package com.jspider.accesswr;
public class Demo1 
{
void test1()
{
System.out.println("Class Demo1");	
}
	
	public static void main(String[] args)
	{
		System.out.println("Program Starts..");	
		new Demo1().test1();
		System.out.println("Program Ends....");	
	
	}

}
