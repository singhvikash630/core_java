package com.jspider.overriding;
class Parent2{
	void test() {
		System.out.println("parent class");
	}
}
abstract public class NonAbstractOverridedByAbstractDemo extends Parent2{
	abstract void test();
	public static void main(String[] args) {
		

	}

}
