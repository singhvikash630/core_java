//using equals() method of object class
package com.jspider.objectclass;

public class Demo5 
{
	int i;int j;
	Demo5(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
	public boolean equals(Object obj)
	{
		//Demo5 d4=(Demo5)obj;
		//return this.i==d4.i;
		return this.i==((Demo5)obj).i;
	    //return (this.i==d4.i && this.j==d4.j);
	   
	}
public static void main(String[] args)
	{
		System.out.println("Program Starts");
		Demo5 d4=new Demo5(12,13);
		Demo5 d5=new Demo5(12,35);
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
