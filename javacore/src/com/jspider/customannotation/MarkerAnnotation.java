package com.jspider.customannotation;

import java.lang.annotation.*;
import java.lang.reflect.*;



//@Retention annotation is used to specify to what level annotation will be available.
@Retention(RetentionPolicy.RUNTIME)  

//@Target tag is used to specify at which type, the annotation is used.
@Target(ElementType.METHOD)  
@interface MyAnnotation{}
 

public class MarkerAnnotation {

	@MyAnnotation 
	public void sayHello()
	{
		Class<? extends MyAnnotation> cls = (Class<? extends MyAnnotation>) this.getClass();
        Method mth;
		try {
			mth = cls.getMethod("sayHello");
			if(mth.isAnnotationPresent((Class<? extends Annotation>) MarkerAnnotation.class)){
	            System.out.println("Hey... marker annotation is present.");
	        } else {
	            System.out.println("Marker annotation is not present.");
	        }
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}  
	
	public static void main(String[] args) {
		
		MarkerAnnotation mat = new MarkerAnnotation();
        mat.sayHello();

	}

}
