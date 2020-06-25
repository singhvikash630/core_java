package com.jspider.jdk8.lamdas;

import java.util.function.BiConsumer;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4 };
		int key = 0;
		process(values, key, wrapperLamda((v, k) -> System.out.println(v / k)));

	}

	private static BiConsumer<Integer, Integer> wrapperLamda(BiConsumer<Integer, Integer> con) {

		return (v, k) -> {
			try {
				con.accept(v, k);
			} catch (Exception e) {
				System.out.println("exception caught in wrapper lamda");
			}

		};
	}

	private static void process(int[] values, int key, BiConsumer<Integer, Integer> con) {
		for (int i : values) {
			con.accept(i, key);
		}
	}
}
