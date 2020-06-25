package com.jspider.exception;

public class A {

	static int i = 9;
	static int j;

	public static void main(String[] args) {
		try {
			int j = i / 0;

		} catch (ArithmeticException e) {
			System.out.println("running catch block");
			System.out.println("j=" + j);
		}
		System.out.println("j=" + j);

	}
}
