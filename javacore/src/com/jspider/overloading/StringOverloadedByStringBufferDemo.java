package com.jspider.overloading;

public class StringOverloadedByStringBufferDemo {
	void test(String a){
		System.out.println("string -version");
	}
	void test(StringBuffer a){
		System.out.println("StringBuffer-version");
	}
	public static void main(String[] args) {
		StringOverloadedByStringBufferDemo demo=new StringOverloadedByStringBufferDemo();		
		demo.test("vikash");//string -version
		demo.test(new StringBuffer("vikash"));//StringBuffer -version
		demo.test(null);//Error:The method test(String) is ambiguous
	}

}
