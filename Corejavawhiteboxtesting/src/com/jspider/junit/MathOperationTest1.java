package com.jspider.junit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathOperationTest1
{
	static MathOperation mo;
	@BeforeClass
	public static void start()
	{
	 mo=new MathOperation();
	 }
	@Test
	public void mulTest()
	{
	System.out.println("test1 method");
	
	int expres=2;
	int actres=mo.mul(2,1);
    Assert.assertEquals(expres, actres);
	}
	@Test
	public void divTest()
	{
	System.out.println("test1 method");
	
	int expres=2;
	int actres=mo.div(4,2);
    Assert.assertEquals(expres, actres);
	}
}
