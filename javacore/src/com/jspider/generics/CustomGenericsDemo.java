package com.jspider.generics;

class Test1<T>
{
    T obj;
    public Test1(T obj) {
        this.obj=obj;
    }
    T getObj() {
        return obj;
    }
    public void show() {
        System.out.println(obj.getClass().getName());

    }
}
public class CustomGenericsDemo {

    public static void main(String[] args) {
        Test1<String> test=new Test1<String>("vikash");
        test.show();
        System.out.println(test.getObj());
        
        Test1<Integer> test1=new Test1<Integer>(10);
        test1.show();
        System.out.println(test1.getObj());

    }

}
