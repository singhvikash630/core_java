package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

class X {

}

class Y extends X {
}

class Z extends Y {
}
public class Test1Super {
	
	public static void insertElements(List<? super X> list){
	    list.add(new X());
	    list.add(new Y());
	    list.add(new Z());
	    System.out.println(list);
	}
	public static void main(String[] args) {
		List<X>      listA      = new ArrayList<X>();
		insertElements(listA);

		List<Object> listObject = new ArrayList<Object>();
		insertElements(listObject);


	}

}
