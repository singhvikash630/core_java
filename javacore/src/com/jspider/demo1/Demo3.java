package com.jspider.demo1;

public class Demo3{
    void test(int a){
        System.out.println("demo2");
    }
    void test(Integer a){
        System.out.println("demo3");
    }
    public static void main(String[] args) {
        Integer a=10;
        Demo3 d3=new Demo3();
        d3.test(2);
        d3.test(a);
    }
}
