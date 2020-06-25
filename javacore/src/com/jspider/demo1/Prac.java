package com.jspider.demo1;
import  java.lang.Thread.State;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
public class Prac{
	final static int a=5;
	Prac()
	{
		final int a;
		//System.out.println(a);
	}
	public static void main(String[] args) {
		HashSet hs=new HashSet();
		System.out.println(hs);
		System.out.println(hs.add(12));
		
		hs.add(13);
		
		System.out.println(hs);
		
		
	}

}
