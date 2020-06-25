package com.jspider.jdk8.lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerDemo {

    public static void main(String[] args) {
        List<Product> list=new ArrayList<Product>();  
        
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));
        
        //prining all product
        performConditionally(list,l -> true,l -> System.out.println("l"));

    }

    private static void performConditionally(List<Product> list, Predicate<Product> predicate, Consumer<Product> consumer) {
       for (Product p : list) {
           if (predicate.test(p)) {
               consumer.accept(p);
           }
    }
       
        
    }


}
