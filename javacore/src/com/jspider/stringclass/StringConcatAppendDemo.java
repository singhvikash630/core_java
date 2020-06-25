package com.jspider.stringclass;

public class StringConcatAppendDemo {

    public static void main(String[] args) {
       String s=new String("durga");
       s.concat("software");
       System.out.println("String:"+s);//durga
       
       StringBuffer s1=new StringBuffer("durga");
       s1.append("software");
       System.out.println("StringBuffer:"+s1);//durgasoftware

    }

}
