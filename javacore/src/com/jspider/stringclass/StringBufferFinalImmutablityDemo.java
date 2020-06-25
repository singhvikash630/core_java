package com.jspider.stringclass;

public class StringBufferFinalImmutablityDemo {

    public static void main(String[] args) {
        
        final StringBuffer sb=new StringBuffer("java");
        sb.append("software");
        System.out.println(sb);
        
        sb=new StringBuffer("solutions");//can not reassign to a  variable
    }

}
