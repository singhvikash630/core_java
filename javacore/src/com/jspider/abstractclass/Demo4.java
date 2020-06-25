package com.jspider.abstractclass;
abstract class Demo4 
{
	int i=10;
	static int j;
	abstract void test1();
	void test2()
	{
	System.out.println("test2() of class Dmo4");
	}
	static void test3()
	{
	System.out.println("test3() of class Dmo4");
	}

	public static void main(String[] args) 
	{
		System.out.println("j="+Demo4.j);
		//Demo4 d4=new Demo4();
		Demo4.test3();
	}
}
