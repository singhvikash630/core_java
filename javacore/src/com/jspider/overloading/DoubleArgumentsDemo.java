package com.jspider.overloading;

public class DoubleArgumentsDemo {
	void test(int a,float b){
		System.out.println("int-float version");
	}
	void test(float a,int b){
		System.out.println("float-int version");
	}
	public static void main(String[] args) {
		DoubleArgumentsDemo demo=new DoubleArgumentsDemo();		
		demo.test(1,2.3f);//int-float version
		demo.test(3.5f,10);//float-int version
		demo.test(10,10);//Error:The method test(int, float) is ambiguous
		demo.test(10.3f,10.5f);//Error:can not find symbol
	}

}
