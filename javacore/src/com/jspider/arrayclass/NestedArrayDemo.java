package com.jspider.arrayclass;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

public class NestedArrayDemo {

    public static void main(String[] args) {
        Object[] obj={1,new Object[]{2,3},4,5,new Object[]{6,7},new Object[]{8,9,new Object[]{10,11}}};
        List list=new ArrayList<>();
        for (Object object : obj) {
            if (object instanceof Object) {
                list.add(object);
            }
        }
        System.out.println(list);
    }

}
