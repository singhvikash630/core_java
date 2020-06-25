//using equals() method of object class
package com.jspider.objectclass;

public class Demo4 
{
	int i;
	Demo4(int i)
	{
		this.i=i;
	}
	public boolean equals(Object obj)
	{
		//Demo4 d4=(Demo4)obj;
	    //return this.i==d4.i;
	    return this.i==((Demo4)obj).i;//optimized code
	   
	}
public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Demo4 d4=new Demo4(30);
		Demo4 d5=new Demo4(30);
		System.out.println("*****compare of address*******");
		System.out.println(d4==d5);//compare address
		System.out.println("*****compare of value*******");
		System.out.println(d4.i==d5.i);//compare value
		System.out.println("*****compare of value using equal() method,implictly compare the address*******");
		System.out.println(d4.equals(d5));//compare address 
		System.out.println("*****compare of value using equal() method,explicitly compare the value*******");
		System.out.println(d4.equals(d5));
		System.out.println("Program Ends");
	}

}
