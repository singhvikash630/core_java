package com.jspider.reflectionapi;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) throws Exception, SecurityException {
        Field field = ConcreteClass.class.getField("publicInt");
        ConcreteClass obj=new ConcreteClass(6);
        System.out.println(field.get(obj));
        field.setInt(obj, 12);
        System.out.println(field.get(obj));
    }}