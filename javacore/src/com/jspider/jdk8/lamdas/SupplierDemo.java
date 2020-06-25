package com.jspider.jdk8.lamdas;

import java.util.function.Supplier;

public class SupplierDemo {


    public static void main(String[] args) {
       Supplier<String> func1  = () ->  new String("vikash");
        System.out.println("Empty String:"+func1.get());       
        
    }


}
