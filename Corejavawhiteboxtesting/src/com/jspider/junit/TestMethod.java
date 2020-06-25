package com.jspider.junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMethod
{
	@BeforeClass
	public static void test7()
	{
		System.out.println("Before class method ");
	}
	@AfterClass
	public static void test8()
	{
		System.out.println("After Class method ");
	}
	@Before
	public void test9()
	{
		System.out.println("Before method ");
	}
	@After
	public void test6()
	{
		System.out.println("After method ");
	}
	@Test
	public void test2()
	{
		System.out.println("test1 method ");
	}
	@Test
	public void test3()
	{
		System.out.println("test2 method ");
	}
	@Test
	public void test4()
	{
		System.out.println("test3 method ");
	}

}
