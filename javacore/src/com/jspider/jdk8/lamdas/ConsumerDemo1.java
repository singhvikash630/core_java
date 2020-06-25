package com.jspider.jdk8.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo1 {

    public static void main(String[] args) { 
        Consumer<String> c = (x) -> System.out.println(x.toLowerCase());
        c.accept("Java2s.com");
    }
}



