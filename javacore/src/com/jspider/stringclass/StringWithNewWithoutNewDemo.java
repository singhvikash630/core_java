package com.jspider.stringclass;

public class StringWithNewWithoutNewDemo {

    public static void main(String[] args) {
        //Will create 3 objects
        String s1=new String("durga");
        String s2=new String("durga");
        String s3="durga";
        String s4="durga";
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s2==s3);//false
        System.out.println(s2==s4);//false
        System.out.println(s3==s4);//true

    }

}
