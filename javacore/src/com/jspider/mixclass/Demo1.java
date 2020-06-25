
//using toString() methods for all class like Object,String & ArrayList

package com.jspider.mixclass;

import java.util.ArrayList;

public class Demo1
{
	int i;
	Demo1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		return ""+i;
	}
	public String toString(String str)
	{
		return ""+str;
	}
	
public static void main(String[] args)
{
	System.out.println("Program Starts");
	Demo1 d1=new Demo1(12);
	String s1=new String("test");
	ArrayList list1=new ArrayList();
	list1.add(12);
	System.out.println(d1);
	System.out.println(s1);
	System.out.println(list1.toString());
	System.out.println("Program ends");
	
		
	}

}
