//Using Comparable interface,we can sort derived array using one attribute of the object

package com.jspider.comparableandcomparator;

import java.util.Arrays;

public class Demo1 implements Comparable
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
	public int compareTo(Object obj)
	{
		return this.i-((Demo1)obj).i;
	}
	
public static void main(String[] args)
{
	System.out.println("program starts");
	Demo1[] array1={new Demo1(14),new Demo1(56),new Demo1(67),new Demo1(12),new Demo1(23)};
	System.out.println("before sorting");
	for(Demo1 arr:array1)
	{
		System.out.println(arr);
	}
	Arrays.sort(array1);
	System.out.println("after sorting");
	for(Demo1 arr:array1)
	{
		System.out.println(arr);
	}
	System.out.println("program ends");
		
	}

}
