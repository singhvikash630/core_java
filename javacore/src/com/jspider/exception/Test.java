package com.jspider.exception;

public class Test {
	int test() {
		int i = 0;
		try {
			System.out.println("inside try block");
			i = 100;
			// System.exit(0);
			return i;

		} catch (Exception e) {
			System.out.println("inside catch block");
			i = 200;
			return i;
		} finally {
			System.out.println("inside finally block");
			i = 300;
			return i;
		}

		// return i;

	}

	public static void main(String[] args) {
		Test d1 = new Test();
		int i = d1.test();
		System.out.println("i=" + i);
	}
}
