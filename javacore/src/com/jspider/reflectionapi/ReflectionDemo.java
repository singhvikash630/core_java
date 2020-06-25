package com.jspider.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public class ReflectionDemo {

    public static void main(String[] args)  {
        
        //way to create the constructor
        ConcreteClass concreteClass1=ConcreteClass.class.newInstance();
        
        ConcreteClass concreteClass2=Class.forName("com.journaldev.reflection.ConcreteClass").newInstance();
        
        Constructor constructor=ConcreteClass.class.getConstructor();
        ConcreteClass concreteClass3= (ConcreteClass) constructor.newInstance();
        
        ConcreteClass concreteClass4=(ConcreteClass)concreteClass1.clone();
        
        ConcreteClass concreteClass5=(ConcreteClass)in.readObject();
        
     // Get Class using reflection
        //For primitive types and arrays, we can use static variable class.
        Class<?> concreteClass = ConcreteClass.class;
        concreteClass = new ConcreteClass(5).getClass();
        try {
            concreteClass = Class.forName("com.journaldev.reflection.ConcreteClass");
        } catch (ClassNotFoundException e) {
           
        }
        System.out.println(concreteClass.getCanonicalName());
        
        //Wrapper classes provide another static variable TYPE to get the class.
        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName());
        
        try {
            Class<?> superClass = Class.forName("com.journaldev.reflection.ConcreteClass").getSuperclass();
            System.out.println(superClass); 
        } catch (ClassNotFoundException e) {
            
        }
        
      //get all public classes,enum,interface under concrete class and super       
        Class<?>[] classes = concreteClass.getClasses();
        
        //get all  classes under concrete class 
        Class<?>[] explicitClasses = Class.forName("com.journaldev.reflection.ConcreteClass").getDeclaredClasses();
    
        //get class name in which inner class has been declared.
        Class<?> innerClass = Class.forName("com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultClass");
        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());
        
        //get package name
        System.out.println(Class.forName("com.journaldev.reflection.BaseInterface").getPackage().getName());
    
        //get class modifiers.
        System.out.println(Modifier.toString(concreteClass.getModifiers()));
        System.out.println(Modifier.toString(Class.forName("com.journaldev.reflection.BaseInterface").getModifiers()));
    
    
      //Get Type parameters (generics)
        TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
        for(TypeVariable<?> t : typeParameters)
        System.out.print(t.getName()+",");
        
      //prints public methods of ConcreteClass, BaseClass, Object
        Method[] publicMethods = Class.forName("com.journaldev.reflection.ConcreteClass").getMethods();
        System.out.println(Arrays.toString(publicMethods));
        
      //Get All public constructors
        Constructor<?>[] publicConstructors = Class.forName("com.journaldev.reflection.ConcreteClass").getConstructors();
        //prints public constructors of ConcreteClass
        System.out.println(Arrays.toString(publicConstructors));
        
      //Get All public fields
        Field[] field = ConcreteClass.class.getFields();
        System.out.println(Arrays.toString(field));
        
        java.lang.annotation.Annotation[] annotations = Class.forName("com.journaldev.reflection.ConcreteClass").getAnnotations();
      //prints [@java.lang.Deprecated()]
      System.out.println(Arrays.toString(annotations));
      
      //Get/Set Public Field Value
      Field field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("publicInt");
      ConcreteClass obj = new ConcreteClass(5);
      System.out.println(field.get(obj)); //prints 5
      field.setInt(obj, 10); //setting field value to 10 in object
      System.out.println(field.get(obj)); //prints 10
      
      
        
        
    }

}
