package com.jspider.innerclass;

public class Nonstaticin
{
	//non-static inner class
	class C
	{
		int i=10;
	}

	public static void main(String[] args)
	{
		System.out.println("program starts");
		C c1=new Nonstaticin().new C();
		System.out.println("i="+c1.i);
		
		System.out.println("program ends");
		
	}

}
