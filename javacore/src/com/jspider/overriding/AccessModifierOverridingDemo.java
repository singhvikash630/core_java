package com.jspider.overriding;
class Parent3{
	public void test() {
		System.out.println("parent class");
	}
}
public class AccessModifierOverridingDemo extends Parent3 {
	void test() {
		System.out.println("parent class");
	}
	public static void main(String[] args) {
		

	}

}
