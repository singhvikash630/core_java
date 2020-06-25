package com.jspider.stringclass;

public class StringConcatDemo {
    public static void main(String[] args) {
        String s1=new String("durga");//2objects,1heap,1scp
        s1.concat("software");//2objects,1heap,1scp
        String s2=s1.concat("solutions");//2objects,1heap,1scp
        s1=s1.concat("soft");//2objects,1heap,1scp
        System.out.println(s1);
        System.out.println(s2);
        
    }
   
}
