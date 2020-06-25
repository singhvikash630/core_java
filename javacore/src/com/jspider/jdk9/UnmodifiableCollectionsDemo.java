package com.jspider.jdk9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnmodifiableCollectionsDemo {

	public static void main(String[] args) {
		//JDK 1,8
		List<String> list1 = new ArrayList<>();list1.add("A");list1.add("B");
		list1= Collections.unmodifiableList(list1);
		//list1.add("vikash");		
		System.out.println(list1);
		
		//JDK 1.9
		List<String> jdk9=List.of("A","B","C");
		Set<String> jdk91=Set.of("A","B","C");
		Map<String,String> jdk92=Map.of("A","B","C","D");

	}

}
