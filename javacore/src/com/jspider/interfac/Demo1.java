package com.jspider.interfac;
interface Demo1 
{
	int i=10;
 void show();
 default void test1(){
     
 }
static void test2(){
     
 }
}
class Demo2 implements Demo1
{
 public void show()
	{
    System.out.println("Show Values of interface class");
 }
}
class Run6
{
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo2 d2=new Demo2();
        d2.show();
		System.out.println("Program Ends");
	}
}
