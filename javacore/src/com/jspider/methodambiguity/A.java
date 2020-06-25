package com.jspider.methodambiguity;

public class A {

	void test(Object obj) {
		System.out.println("xyz");
	}

	void test(String str) {
		System.out.println("abc");
	}
	void sum(int i, long j) {  System.out.println("xxxx"); }
   //    void sum(long i, int j) { System.out.println("yyyyy");  }

	public static void main(String[] args) {
		A a1 = new A();
		a1.test(null);
		//a1.test("sanu");
		//a1.sum(5, 5);
		a1.sum(5, (long)5);

	}

}
