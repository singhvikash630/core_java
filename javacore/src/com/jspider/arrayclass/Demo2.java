package com.jspider.arrayclass;
class A
{
int i;
A(int i)
{
	this.i=i;
}
public String toString()
{
return ""+i;	
}
}

public class Demo2
{
public static void main(String[] args)
{
	System.out.println("program starts");
	A[] array1=new A[5];
	for(A a1:array1)
	{
		System.out.println(a1);
	}
	array1[0]=new A(12);
	array1[1]=new A(13);
	array1[2]=new A(14);
	array1[3]=new A(18);
	array1[4]=new A(19);
	System.out.println("array elements");
	for(int i=0;i<array1.length;i++)
	{
		System.out.println(array1[i]);
	}
	
	System.out.println("program ends");
		
	}
}


