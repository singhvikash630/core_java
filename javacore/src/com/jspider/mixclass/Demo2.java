
//using equals() methods for all class like Object,String & ArrayList

package com.jspider.mixclass;

import java.util.ArrayList;

public class Demo2
{
	int i;
	Demo2(int i)
	{
		this.i=i;
	}
	 public String toString()
	{
		return ""+"vikash";//when both the literals are string then its true otherwise false.
	}
	public int hashCode()
	{
	return 123;
	}
public static void main(String[] args)
{
	System.out.println("Program Starts");
	Demo2 d2=new Demo2(12);
	Demo2 d3=new Demo2(12);
	System.out.println(d2==d3);
	System.out.println(d2.toString());
	System.out.println(d3.toString());
	System.out.println(d2.toString()==d3.toString());
	System.out.println(d2.equals(d3));
	System.out.println(d2.hashCode());
	System.out.println(d3.hashCode());
	
	System.out.println("Program ends");
	
		
	}

}
