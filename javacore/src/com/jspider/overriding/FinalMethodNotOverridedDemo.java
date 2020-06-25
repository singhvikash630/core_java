package com.jspider.overriding;
class Parent{
	 final void test() {
		System.out.println("parent class");
	}
}
public class FinalMethodNotOverridedDemo extends Parent{
	 void test() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
