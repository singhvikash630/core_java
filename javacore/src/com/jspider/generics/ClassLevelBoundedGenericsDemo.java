package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;
class TestUnbound<T>{
    
}
class Test1Bound<T extends Number>{
    
}
class Test2Bound<T extends Number & Runnable>{
    
}
class Test3Bound<T extends Number & Runnable & Comparable>{
    
}
public class ClassLevelBoundedGenericsDemo<T extends Runnable> {	

	public static void main(String[] args) {
	    ClassLevelBoundedGenericsDemo<Runnable> obj1=new ClassLevelBoundedGenericsDemo<Runnable>();
	    ClassLevelBoundedGenericsDemo<Thread> obj2=new ClassLevelBoundedGenericsDemo<Thread>();
	    ClassLevelBoundedGenericsDemo<Integer> obj3=new ClassLevelBoundedGenericsDemo<Integer>();

	}

}
