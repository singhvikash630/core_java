//Compiletime Polymorphism
package com.jspider.polymorphism;
class Demo2 
{
	static float f=3.0f;
	int add(int x,int y)
	  {
	  return x+y;
	  }
	int add(int x,int y,int z)
	  {
	   return x+y+z;
	  }
	int add(int x,float y)
	  {
	  return (int)(x+y);
	  }
public static void main(String[] args) 
	{
	System.out.println("Program Starts");
    Demo2 d1=new Demo2();
	System.out.println("Sum of two integer="+d1.add(3,5));
	System.out.println("Sum of three integer="+d1.add(3,5,6));
	System.out.println("Sum of one double & one integer="+d1.add(3,5));
    System.out.println(f);
	}
}
