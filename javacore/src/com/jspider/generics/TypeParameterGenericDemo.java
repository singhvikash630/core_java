package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

class GenericClass1<T> {
//can use T within the class based our requirement
}

class GenericClass2<T extends Number & Runnable> {
	//can use T within the class based our requirement
	}

class GenericClass3 {
public <T>void test1() throws Exception {
	//can use T within the method based our requirement
}
public <T extends Number>void test2() throws Exception {
	//can use T within the method based our requirement
}
}
public class TypeParameterGenericDemo {}
