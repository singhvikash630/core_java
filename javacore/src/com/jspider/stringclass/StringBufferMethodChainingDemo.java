package com.jspider.stringclass;

public class StringBufferMethodChainingDemo {

    public static void main(String[] args) {
       StringBuffer sb=new StringBuffer();
       sb.append("vikash").insert(1, 's').reverse();//method chaining
       System.out.println(sb);

    }

}
