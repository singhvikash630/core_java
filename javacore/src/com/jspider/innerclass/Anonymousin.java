package com.jspider.innerclass;

public class Anonymousin
{
	void test()
	{
		System.out.println("test() method of class Anonymuoys");
	}
public static void main(String[] args) 
{
	System.out.println("program starts");
	Anonymousin ai=new Anonymousin()
	
	//Anonymuous class
	    {
		void test()
		{
			System.out.println("test() method of unknown class");
			test1();
		}
		void test1()
		{
			System.out.println("test1() method of unknown");
		}
	};
	ai.test();
	Anonymousin ai1=new Anonymousin();
	ai1.test();
	System.out.println("program ends");
		
	}

}
