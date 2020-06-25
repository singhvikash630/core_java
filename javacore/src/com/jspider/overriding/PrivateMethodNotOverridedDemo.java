package com.jspider.overriding;
//it's valid but not overriding
class Demo{
	private void test() {
		System.out.println("parent class");
	}
}
public class PrivateMethodNotOverridedDemo extends Demo{
	private void test() {
		System.out.println("child class");
	}
	public static void main(String[] args) {
		PrivateMethodNotOverridedDemo demo=new PrivateMethodNotOverridedDemo();
		demo.test();

	}

}
