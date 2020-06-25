package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

public class FromNonGenericToGenericAreaDemo {
    public static void test1(ArrayList list) {

        list.add(10);
        list.add(true);//can add all datatype in non-generic area
    }
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("sanu");
        list.add("vikash");
        //list.add(10);//we can add only string in generic area        
        test1(list);
        System.out.println(list);


    }

}
