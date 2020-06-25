package com.jspider.clone;

class Cat {

    int j;

    public Cat(int s) {
        j = s;
    }

}

class Dog implements Cloneable  {
    //Contained object
    Cat c;
    int i;	  
    public Dog(int s, Cat c) {
        this.i = s;
        this.c = c;
    }      
    public Object clone() throws CloneNotSupportedException {
        return super.clone();}
}

public class ShallowCopy1 {	
    public static void main(String[] args) throws CloneNotSupportedException {	
        Cat c=new Cat(10);
        //Original Object
        Dog dog1 = new Dog(10, c);
        //Clone Object
        Dog dog2= (Dog) dog1.clone();

        System.out.println("Original Object: " + dog1.i + " - "	+ dog1.c.j);		

        System.out.println("Original Object: " + dog2.i + " - " + dog2.c.j);
        dog2.i=100;
        dog2.c.j=200;
        System.out.println("Original Object: " + dog1.i + " - " + dog1.c.j);        

        System.out.println("Cloned Object: " + dog2.i + " - " + dog2.c.j);
        
    }

}
