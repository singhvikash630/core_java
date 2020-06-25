package com.jspider.jdk8.lamdas;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		int x=10;
		Integer y=20;
		List<Integer> list = Arrays.asList(2, 4, 5, 6);
		System.out.println(list.stream().mapToInt(i->i).sum());
		System.out.println(list.stream().mapToInt(i->i).max());
		System.out.println(list.stream().mapToInt(i->i).min());
		System.out.println(list.stream().mapToInt(i->i).count());
		System.out.println(list.stream().mapToInt(i->i).sorted());
		
		
	}

}
