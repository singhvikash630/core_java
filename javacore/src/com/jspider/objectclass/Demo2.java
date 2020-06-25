
//using toString() & hashCode() method

package com.jspider.objectclass;

public class Demo2 
{
	int i;
	int j;
	
public String toString(int i,int j)
{
return "("+i+","+j+")";	
}
public String toString()
{
return "("+i+","+j+")";	
}
public int hashCode()
{
	return 123;
	}
	
	public static void main(String[] args)
	{
	System.out.println("program Starts");
	Demo2 d2=new Demo2();
	System.out.println(d2.toString(25,30));
	System.out.println("*************************");
	Demo2 d3=new Demo2();
	System.out.println(d3);
	System.out.println("******address of object in integer format*******");
	System.out.println(d3.hashCode());
	System.out.println("Program Ends");
	}

}
