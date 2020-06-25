package com.jspider.overloading;

public class StringOverloadedByObjectDemo {
	void test(String a){
		System.out.println("string -version");
	}
	void test(Object a){
		System.out.println("object-version");
	}
	public static void main(String[] args) {
		StringOverloadedByObjectDemo demo=new StringOverloadedByObjectDemo();
		demo.test(new Object());//object-version
		demo.test("vikash");//string -version
		demo.test(null);//string -version
	}

}
