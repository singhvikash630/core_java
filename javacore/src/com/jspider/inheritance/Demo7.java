package com.jspider.inheritance;

class Xyz {
	public static String foo = "vikash";
}

class Abc extends Xyz {	
	static {
		foo = "bar";
	}
}

public class Demo7 {

	public static void main(String[] args) {

		System.out.println(Xyz.foo);
		System.out.println(Abc.foo);

	}

}
