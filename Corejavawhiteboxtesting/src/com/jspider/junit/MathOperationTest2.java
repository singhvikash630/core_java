package com.jspider.junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOperationTest2
{
	static MathOperation mo;
	@BeforeClass
	public static void start()
	{
	 mo=new MathOperation();	
	}
	
	@Test
	public void addTest()
	{
	System.out.println("test1 method");
	int expres=2;
	int actres=mo.add(1,1);
    Assert.assertEquals(expres, actres);
	}
	@Test
	public void subTest()
	{
	System.out.println("test1 method");
	
	int expres=2;
	int actres=mo.sub(3,1);
    Assert.assertEquals(expres, actres);
	}
	

}
