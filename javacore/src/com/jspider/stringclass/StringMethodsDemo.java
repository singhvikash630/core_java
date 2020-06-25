package com.jspider.stringclass;

public class StringMethodsDemo {

    public static void main(String[] args) {
        String s1=new String("durga");
        String s2=new String("durga");
        s1.charAt(0);
        
        s1.concat("software");
        //s=s+"software";//overloaded operators
        //s+="software";////overloaded operators
        
        s1.equals(s2);        
        s1.equalsIgnoreCase(s2);
        
        s1.substring(1);
        s1.substring(1, 3);
        
        s1.length();
        
        s1.replace('d', 'a');
        
        s1.toLowerCase();
        s1.toUpperCase();
        
        s1.trim();//remove the blank space both start and end
        
        s1.indexOf('d');
        s1.lastIndexOf('a');
        
        s1.toString();
        
        
        
        

    }

}
