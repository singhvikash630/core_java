package com.jspider.overloading;

public class TypePromotionDemo {
	void test(int a){
        System.out.println("int-arg");
    }
    void test(float a){
        System.out.println("float-arg");
    }
	public static void main(String[] args) {
		TypePromotionDemo demo=new TypePromotionDemo();
		demo.test(1);//int-arg
		demo.test('a');////int-arg
		demo.test(3.5f);//float-arg
		demo.test(3L);//float-arg
		demo.test(3.5);//Error

	}

}
