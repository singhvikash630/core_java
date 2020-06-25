package com.jspider.practice;
class Day
{
	int test()
	{
		int i=0;
		try
		{
			i=100/0;
		}
		catch(Exception e)
		{
		i=200;	
		return i;
		}
		finally
		{
		i=300;	
		//return i;
		}
		return i;
	}
	public static void main(String args[]) 
	{
	Day d1=new Day();
	int i=d1.test();
	System.out.println("i="+i);
	}
}
