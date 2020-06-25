package com.jspider.jdk8.lamdas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
       BiConsumer<Integer,Integer> j=(a,b) -> System.out.println(a+b);
       j.accept(2, 3);
       

       
       Map<String, String> map = new HashMap<String, String>();
       String[][] tempStrArr = {{"Chris","USA"}, {"Raju","India"}, {"Lynda","Canada"} };

       // Create a Map using String Array
       for( int i = 0; i < tempStrArr.length; i++ ) {
           map.put( tempStrArr[i][0], tempStrArr[i][1] );
       }

       // Traditional way of printing key, value
       Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
       if( iter != null ) {
           while( iter.hasNext() ) {
               Map.Entry<String, String> entry = iter.next();
               System.out.println( "Key: " + entry.getKey() + "\t" + " Value: " + entry.getValue() );
           }
       }

       // Using Lambda Expression: All in One line
       map.forEach( (key, value) -> { System.out.println( "Key: " + key + "\t" + " Value: " + value ); });

    }

}
