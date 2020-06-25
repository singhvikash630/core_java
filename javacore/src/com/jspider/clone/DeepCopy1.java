package com.jspider.clone;

class Cat1 {

    int j;

    public Cat1(int s) {
        j = s;
    }

}

class Dog1 implements Cloneable  {
    //Contained object
    Cat1 c;
    int i;	  
    public Dog1(int s, Cat1 c) {
        this.i = s;
        this.c = c;
    }      
    public Object clone() throws CloneNotSupportedException {
        Cat1 c1=new Cat1(i);
        Dog1 d1=new Dog1(i,c1);
        return d1;
        }
}

public class DeepCopy1 {	
    public static void main(String[] args) throws CloneNotSupportedException {	
        Cat1 c=new Cat1(10);
        //Original Object
        Dog1 Dog11 = new Dog1(10, c);
        //Clone Object
        Dog1 Dog12= (Dog1) Dog11.clone();

        System.out.println("Original Object: " + Dog11.i + " - "	+ Dog11.c.j);		

        System.out.println("Original Object: " + Dog12.i + " - " + Dog12.c.j);
        Dog12.i=100;
        Dog12.c.j=200;
        System.out.println("Original Object: " + Dog11.i + " - " + Dog11.c.j);        

        System.out.println("Original Object: " + Dog12.i + " - " + Dog12.c.j);

    }

}
