package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;



public class MethodLevelGenericsDemo {

	public static void test1(List<String> l) {
		//add String type
	}
	public static void test2(List<?> l) {
		//call by adding any type
		//l.add(10);
		//l.add(10.5);
		l.add(null);//inside method we can add only null
	}
	public static void test3(List<? extends Number> l) {
		//call by adding X type or child class or implementation class
		l.add(null);//inside method we can add only null
	}
	public static void test4(List<? super X> l) {
		//add X type or super class.if X is interface then X type or super class of implementation class of X
		//Ex : X=Runnable then its implementation class is thread so we can add its super class i.e object.
		l.add(X);l.add(null);//inside method we can add X type and null
	}

	public static void main(String[] args) {	
		//ArrayList<?> lst1=new ArrayList<?>();//we cann't write without bound at right side.
		//ArrayList<?> lst2=new ArrayList<? extends X>();//we cann't write without unbound at right side.
		ArrayList<?> lst3=new ArrayList<String>();
		
	}

}
