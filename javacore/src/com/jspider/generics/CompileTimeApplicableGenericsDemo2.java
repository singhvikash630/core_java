package com.jspider.generics;

import java.util.ArrayList;

public class CompileTimeApplicableGenericsDemo2 {
    //here compiler will remove generics after compilation, 
    //So both the method have same erasure
    private void test(ArrayList<String> list) { 
        
    }
    private void test(ArrayList<Integer> list) {
        
    }
    public static void main(String[] args) {


    }

}
