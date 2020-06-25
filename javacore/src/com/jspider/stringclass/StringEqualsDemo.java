package com.jspider.stringclass;

public class StringEqualsDemo {

    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=new String("durga");
        
        System.out.println(s1==s2);//false
        System.out.println(s1.equals(s2));//true
        
        StringBuffer s3=new StringBuffer("durga");
        StringBuffer s4=new StringBuffer("durga");
        
        System.out.println(s3==s4);//false
        System.out.println(s3.equals(s4));//false
       

     }

}
