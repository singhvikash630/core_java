package com.jspider.jdk8.lamdas;


public class TypeInferenceDemo {

    public static void main(String[] args) {
        pringLambda(s -> s.length());

    }

    public static void pringLambda(StringLengthLamda myLamda){
        System.out.println(myLamda.getLength("vikash"));
    }

    interface StringLengthLamda{
        int getLength(String s);
    }

}
