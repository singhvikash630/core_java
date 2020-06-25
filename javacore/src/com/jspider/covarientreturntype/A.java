package com.jspider.covarientreturntype;

class B {
	B get()
	{
		return this;
	}
}

public class A extends B {
	@Override
	A get() 
	{
		return this;
	}
	void message() {
		System.out.println("welcome to covariant return type");
	}

	public static void main(String[] args) {
		A a1=new A();
		a1.get().message();

	}

}
