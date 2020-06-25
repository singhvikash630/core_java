package com.jspider.jdk8.lamdas;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

 class Item {

    private String name;
    private int qty;
    private BigDecimal price;  
    
    
    public Item(String name, int qty, BigDecimal price) {
        super();
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    //constructors, getter/setters 
}

public class StreamGroupByDemo {

    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        
        Map map=items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
        System.out.println(map);
        
        Map map1=items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
        System.out.println(map1);
        
        List<Integer> list = Arrays.asList(2, 4, 5, 6);
        System.out.println(list.stream().mapToInt(i->i).sum());
		System.out.println(list.stream().mapToInt(i->i).average());
		System.out.println(list.stream().mapToInt(i->i).max());
		System.out.println(list.stream().mapToInt(i->i).min());
		System.out.println(list.stream().mapToInt(i->i).count());
       
    }

}
