package com.jspider.overloading;

public class GeneralVarArgMethodDemo {
	void test(int a){
		System.out.println("General Method");
	}
	void test(int... b){
		System.out.println("var-arg method");
	}
	public static void main(String[] args) {
		GeneralVarArgMethodDemo demo=new GeneralVarArgMethodDemo();
		demo.test(10);//General Method
		demo.test();//var-arg method
		demo.test(10,20);//var-arg method
		demo.test(10,'a');//var-arg method

	}

}
