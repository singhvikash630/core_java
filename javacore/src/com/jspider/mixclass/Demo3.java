package com.jspider.mixclass;

public class Demo3 
{
	public String toString()
	{
		System.out.println("vikash");
		return "vikash";
	}

	public static void main(String[] args) 
	{
		Demo3 d3=new Demo3();
		String s1=new String("test");
		String s2=new String("test");
		String s3="vikash";
		String s4="vikash";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.toString()==s2.toString());
		System.out.println(s3==s4);
		System.out.println(s3.toString()==s4.toString());
		
	}

}
