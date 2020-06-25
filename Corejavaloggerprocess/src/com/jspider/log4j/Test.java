package com.jspider.log4j;



interface AddFunction{    
    int add(int a);
}
public class Test {
    /*int perform(AddFunction add)
    {
        return add.add(2, 3);
    }*/
public static void main(String[] args) {
    //LamdaAdd add=new LamdaAdd();
    AddFunction addFun=a -> a;
    System.out.println("Sum="+addFun.add(1));
}
}
