package com.jspider.jdk9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPIEnhancementsDemo {

	public static void main(String[] args) {
		// JDK1.8
		List<Integer> numbers = Arrays.asList(6, 2, 2, 3, 7, 3, 5,8,null);
		
		/*filter()*/
        List<Integer> jdk8 = numbers.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("jdk8:"+jdk8);
        
		 /*takeWhile()*/
        List<Integer> jdk9_1 = numbers.stream().takeWhile(i -> i%2==0).collect(Collectors.toList());
        System.out.println("jdk9_1:"+jdk9_1);
        
        /*dropWhile()*/
        List<Integer> jdk9_2 = numbers.stream().dropWhile(i -> i%2==0).collect(Collectors.toList());
        System.out.println("jdk9_2:"+jdk9_2);
        
        /*iterator() with 3 arguments*/
		IntStream.iterate(3, i -> i < 10, i -> i + 3).forEach(System.out::println);	
		
		/*ofNullable()*/
		List l=Stream.ofNullable(100).collect(Collectors.toList());
		System.out.println(l);
		List l1=Stream.ofNullable(null).collect(Collectors.toList());
		System.out.println(l1);
		
		List l3=numbers.stream().flatMap(o-> Stream.ofNullable(o)).collect(Collectors.toList());
		System.out.println(l3);
		
		
		
		
	}

}
