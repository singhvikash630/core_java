package com.jspider.demo1;

public interface Demo2 {
    default void test(){
        System.out.println("demo2");
    }
}
