package com.jspider.jdk9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarargsDemo {

	@SafeVarargs
	private static void test(List<String>... lists) {
		ArrayList<String> flist = new ArrayList<>();
		for (List<String> list : lists) {
			flist.addAll(list);
		}
		System.out.println(flist);
	}
	
	@SafeVarargs
	private static void test1(List<String>... l) {
		Object[] obj=l;
		obj[0]=Arrays.asList(10,20);
		String name=(String)l[0].get(0);
		System.out.println(name);
	}

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();list1.add("A");list1.add("B");
		List<String> list2 = new ArrayList<>();list2.add("C");list2.add("D");
		test(list1, list2);
	}

}
