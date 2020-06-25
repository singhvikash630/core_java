package com.jspider.overriding;

public class MethodSignatureDemo {
    //duplicate method signature return type will not part of method signature
    void test(int i)

    }
    int test(int i)
    {
        return 0;
    }
    public static void main(String[] args) {
        MethodSignatureDemo obj=new MethodSignatureDemo();
        obj.test(10);//peoblem with which method will call

    }

}
