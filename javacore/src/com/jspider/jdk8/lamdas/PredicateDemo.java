package com.jspider.jdk8.lamdas;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		Predicate<String> i = s -> s.length() > 5;
		Predicate<String> j = s -> s.length() < 3;

		System.out.println(i.test("java2s.com "));
		System.out.println(i.and(j).test("java2s.com "));
		System.out.println(i.or(j).test("java2s.com "));
		System.out.println(i.negate().test("java2s.com "));

		Predicate<String> i1 = Predicate.isEqual("asdf");

		System.out.println(i1.test("java2s.com "));

	}

}
