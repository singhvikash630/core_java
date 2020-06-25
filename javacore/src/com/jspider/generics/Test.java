package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

class XX {

}

class YY {
}

class ZZ {
}

public class Test {

	public static void processElements(List<?> elements) {
		for (Object o : elements) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		List listA = new ArrayList ();
		listA.add(new XX());
		listA.add(10);
		listA.add("vikash");
		processElements(listA);

		

	}

}
