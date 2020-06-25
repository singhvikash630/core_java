package com.jspider.stringclass;

public class StringBufferMethodsDemo {

    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("vikash");
        
        s1.length();
        s1.capacity();
        s1.charAt(3);
        s1.setCharAt(1, 'c');
        
        s1.append(str);
        s1.append(int);
        s1.append(float);//overloaded methods
        
        s1.insert(1, str);
        s1.insert(3, int);//many more overloaded methods
        
        s1.delete(2, 5);
        s1.deleteCharAt(4);
        
        s1.reverse();
        s1.setLength(3);//vik
        
        s1.ensureCapacity(1000);//1000//cam increase the capacity on demand

        s1.trimToSize();//release extra memory
    }

}
