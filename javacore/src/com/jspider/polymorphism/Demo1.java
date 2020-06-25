package com.jspider.polymorphism;
class A
  {
   void test1()
    {
     System.out.println("class A");	
    }
  }
class B extends A
  {
	void test1()
	  {
	  System.out.println("class B");	
	  }
  }
class C extends B
   {
	void test1()
	  {
	  System.out.println("class C");	
	  }
   }
public class Demo1
   {
	public static void main(String[] args)
		{
		A a1=new A();
		A b1=new B();
		A c1=new C();
		a1.test1();
		b1.test1();
		c1.test1();
		}
   }
