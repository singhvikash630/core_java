package com.jspider.generics;

import java.util.ArrayList;

public class CompileTimeApplicableGenericsDemo1 {

    public static void main(String[] args) {
        
        //All are same because compiler will check the refrence and remove 
       // the generics syntax so JVM will not get the generics syntax
        ArrayList list=new ArrayList<String>();
        ArrayList list1=new ArrayList<Integer>();
        ArrayList list2=new ArrayList<Double>();
        ArrayList list3=new ArrayList<Float>();
        ArrayList list4=new ArrayList();
        list.add(10);
        list.add("vikash");
        list.add(10.2);
        System.out.println(list);
        
        //Below are same
        ArrayList<String> list5=new ArrayList<String>();
        ArrayList<String> list6=new ArrayList();

    }

}
