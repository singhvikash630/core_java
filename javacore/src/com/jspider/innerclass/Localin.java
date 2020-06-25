package com.jspider.innerclass;

public class Localin
{	
	int i=9;
	public static void main(String[] args)
	{
		System.out.println("program starts");
		
		//local inner class
		class A
		{
			int k=10;
			Localin li=new Localin();
			
			void test1()
			{
				System.out.println("i="+li.i);
				System.out.println("k="+k);
			}
		}
		A a1=new A();
		System.out.println("k="+a1.k);
		a1.test1();
		System.out.println("program ends");
	}
}
