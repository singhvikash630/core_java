package com.jspider.waytocreateobject;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;

class A implements Cloneable{}
public class CreationObjectDemo {

    public static void main(String[] args) throws Exception, IllegalAccessException {
       //by new operator
        A a1=new A();//1
       
        //by newInstance() method of Class class
       A a2=(A) Class.forName("").newInstance();//2
       A a21=A.class.newInstance();
       
       //by newInstance() method of Constructor class
       Constructor<A> c=A.class.getConstructor();
       A a3=c.newInstance();
       
       //by using clone method
       A a4=(A)a2.clone();
       
       //using deserialization
       ObjectInputStream in=new ObjectInputStream(new FileInputStream("emp.ser"));
       A a5=(A) in.readObject();
       
       

    }

}
