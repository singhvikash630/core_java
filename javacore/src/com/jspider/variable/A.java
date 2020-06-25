package com.jspider.variable;

public class A
{
	static  int i;
	//i=10;
	 
	 void test()
	 {
		System.out.println(i); 
	 }
	public static void main(String[] args)
	{
		int i=10;
		i=20;
		i++;		
		A.i=30;
		i++;
		System.out.println("global variable:"+A.i);
		System.out.println("local variable:"+i);
	}

}
