package com.jspider.overloading;

public class IntegerOverloadedByintDemo{
    void test(int a){
        System.out.println("demo2");
    }
     void test(Integer a){
        System.out.println("demo3");
    }
    public static void main(String[] args) {
        //Integer a=10;
        IntegerOverloadedByintDemo d3=new IntegerOverloadedByintDemo();
        d3.test(2);  //demo2      
        d3.test(new Integer(4));//demo3
        d3.test(null);//demo3
    }
}
