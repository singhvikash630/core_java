package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

class A {

}

class B extends A {
}

class C extends B {
}

public class Test2Extends {

	public static void processElements(List<? extends A> elements) {
		for (A a : elements) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {

		List<A> listA = new ArrayList<A>();
		listA.add(new A());
		processElements(listA);

		List<B> listB = new ArrayList<B>();
		listB.add(new B());
		processElements(listB);

		List<C> listC = new ArrayList<C>();
		processElements(listC);

	}

}
