//using toString() & hashCode() method using inheritance
package com.jspider.objectclass;
public class Demo3 
{
	int i;
	int j;
	Demo3(int i,int j)
	{
		this.i=i;
		this.j=j;
	}
public String toString(int i,int j)
{
return "("+i+","+j+")";	
}
public String toString()
{
return "("+i+","+j+")";	
}
}
class Demo extends Demo3
{
Demo()
{
super(12,34);	
}
public static void main(String[] args)
	{
	System.out.println("program Starts");
	Demo d4=new Demo();
	System.out.println(d4);
	System.out.println("Program Ends");
	}
}
