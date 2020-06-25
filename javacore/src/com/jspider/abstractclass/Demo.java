package com.jspider.abstractclass;

interface Dem
{
void test();

}
public class Demo implements Dem
{

	public static void main(String[] args)
	{
	Demo d1=new Demo();
	d1.test();
		
	}

	@Override
	public void test() 
	{
		System.out.println("class demo");
		
	}

}
