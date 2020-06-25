package com.jspider.interfac;
interface Demo4 
{
 void show(int a);
}
class Demo25 implements Demo4
{
 public void show(int p)
	{
    System.out.println("Show Values of interface class="+p);
 }
}
class Run8
{
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo25 d1=new Demo25();
        d1.show(12);
		System.out.println("Program Ends");
	}
}
