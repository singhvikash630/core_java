package com.jspider.jdk9;

import java.util.ArrayList;
import java.util.Iterator;

public class DiamondOperatorEnhancements {	
	

	public static void main(String[] args) {
		
		ArrayList<String> java5=new ArrayList<String>();//JDK1.5
		
		ArrayList<String> java7=new ArrayList<>();//JDK1.7 Diamond Operator
		
		//JDK1.9 Diamond Operator allowed for annonymous inner classes(child class of ArrayList)
		ArrayList<String> java9=new ArrayList<>() {
		
			
		};
		
		//JDK1.9 Diamond Operator allowed for annonymous inner classes(child class of Iterator)
		
		Iterator<String> itr=new Iterator<>() {

			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String next() {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
