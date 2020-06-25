package com.jspider.innerclass;

public class Staticin 
{
	int i=10;
	
	//static inner class
	
	static class B
	{
		static int j=11;
		int k=9;
		void test1()
		{
			Staticin si=new Staticin();
			
			System.out.println("i="+si.i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("program starts");
		Staticin.B b1=new Staticin.B();
		System.out.println("k="+b1.k);
		System.out.println("j="+B.j);
		b1.test1();
		System.out.println("program ends");
		
	}

}
