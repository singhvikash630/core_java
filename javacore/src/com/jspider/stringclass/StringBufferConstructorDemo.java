package com.jspider.stringclass;

public class StringBufferConstructorDemo {
    public static void main(String[] args) {
        String s=new String("durga");
        System.out.println(s.length());
        
        StringBuffer s1=new StringBuffer();//16,NC=(cc+1)*2//1constructor
        s1.append("vikashaaaaaaaaaaa");
        System.out.println(s1.length());
        System.out.println( s1.capacity());//34
        
        StringBuffer s1=new StringBuffer("vikash");//2nd constructor
        System.out.println( s1.capacity());//21
        
        StringBuffer s2=new StringBuffer(int initialCapacity);//3rd constructor
       
        
    }
   
}
