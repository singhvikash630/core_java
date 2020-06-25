package com.jspider.overloading;
class Animal{}
class Monkey extends Animal{}
public class CompileAndRuntimeDemo {
	void test(Animal a){
		System.out.println("Animal version");
	}
	void test(Monkey b){
		System.out.println("Monkey version");
	}
	public static void main(String[] args) {
		CompileAndRuntimeDemo demo=new CompileAndRuntimeDemo();
		Animal a1=new Animal();
		Monkey m1=new Monkey();
		Animal a2=new Monkey();
		demo.test(a1);//Animal version
		demo.test(m1);//Monkey version
		demo.test(a2);//Animal version
	}

}
