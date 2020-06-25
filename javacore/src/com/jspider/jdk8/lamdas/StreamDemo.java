package com.jspider.jdk8.lamdas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        
        /*forEach(),limit()*/
       
        numbers.stream().limit(5).forEach(System.out::println);
        
        /*filter()*/
        List<Integer> filtered = numbers.stream().filter(i -> i%2==0).collect(Collectors.toList());
        System.out.println("filter:"+filtered);
        
      //map() one->one get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        System.out.println("squaresList:"+squaresList);
        
      //flatMap()one -> any get list of unique squares
        List<Integer> l2 = numbers.stream().
        		flatMap( i ->{ if(i%2!=0)
        						return Stream.empty();
        					else return Stream.of(i);
        					}).collect(Collectors.toList());
        System.out.println("L2:"+l2);
        
         
        
        /*sorted()*/
        List<Integer> sorted=numbers.stream().limit(5).sorted().collect(Collectors.toList());
        System.out.println("Sorted:"+sorted);
        
        /*Parallel Processing*/
        int count = (int) strings.parallelStream().filter(string -> string.isEmpty()).count();
        System.out.println("count:"+count);
        
        
        
        /*Statistics*/
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());
        
        System.out.println("Print even numbers:");
        eval(numbers, n-> n%2 == 0 );
    }

    private static void eval(List<Integer> numbers, Predicate<Integer> predicate) {
        for (Integer n : numbers) {
           if( predicate.test(n)){
               System.out.println(n+" ");
           }
        }
        
    }

}
