package com.jspider.stringclass;

public class StringToLowerToUpperDemo {

    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=s1.toUpperCase();
        String s3=s1.toLowerCase();
        
        String s4=s2.toLowerCase();
        String s5=s4.toLowerCase();
        
        System.out.println(s1==s2);//false
        System.out.println(s1==s3);//true
        

    }

}
