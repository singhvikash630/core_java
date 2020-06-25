package com.jspider.stringclass;

public class StringToStringToLowerToUpperDemo {

    public static void main(String[] args) {
        String s1="durga";
        String s2=s1.toString();
        System.out.println(s1==s2);//true
        
        String s3=s1.toLowerCase();
        System.out.println(s1==s3);//true
        
        String s4=s1.toUpperCase();
        System.out.println(s1==s4);//false
        
        String s5=s4.toLowerCase();
        System.out.println(s4==s5);//false
        
        

    }

}
