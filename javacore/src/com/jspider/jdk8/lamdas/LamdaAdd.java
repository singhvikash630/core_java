package com.jspider.jdk8.lamdas;
interface AddFunction{
    int add(int a,int b);
}
public class LamdaAdd {
    /*int perform(AddFunction add)
    {
        return add.add(2, 3);
    }*/
public static void main(String[] args) {
    //LamdaAdd add=new LamdaAdd();
    AddFunction addFun=(a,b) -> a+b;
    System.out.println("Sum="+addFun.add(1, 2));
}
}
