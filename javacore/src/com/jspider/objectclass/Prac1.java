package com.jspider.objectclass;

public class Prac1 
{
	int i;
	Prac1(int i)
	{
		this.i=i;
	}
	public String toString()
	{
		int i=10;
		return "vikash"+i;
	}
	
	public boolean equals(Object obj)
	{
		Prac1 p3=(Prac1)obj;
		//return this.i==p3.i;
		return this.i==((Prac1)obj).i;
		}
public static void main(String[] args) throws Exception
{
	Prac1 p1=new Prac1(12);
	Prac1 p2=new Prac1(12);
	System.out.println(p1);//vikash
	System.out.println(p2);//vikash
	System.out.println(p1.toString());//vikash
	System.out.println(p1.hashCode());//
	System.out.println(p1.equals(p2));//false
	System.out.println(p1.getClass());//fully classified class name
	System.out.println(p1==p2);//false
	System.out.println(p1.toString()==p2.toString());//true
	}
	
		
	}


