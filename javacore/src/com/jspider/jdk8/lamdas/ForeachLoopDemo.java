package com.jspider.jdk8.lamdas;

import java.util.ArrayList;
import java.util.List;

public class ForeachLoopDemo {
    
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach((n)->System.out.println(n));  
    }  
}
