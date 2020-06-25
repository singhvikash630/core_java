package com.jspider.generics;

import java.util.ArrayList;

public class GenericsRequirementDemo {

	
	public static void main(String[] args) {
		//suppose we have to gve all students names usng Arrays
		String[] str=new String[100];
		str[0]="ramesh";str[1]="sanu";
		//str[3]=10;//this problem will come at compile time only so we can fix
		System.out.println("--------------------------");
		
		//using collection we can not find the mstae at compile time
		ArrayList lst=new ArrayList();
		lst.add("vash");lst.add("sanu");
		lst.add(10);//no problem at compile tme
		
		//now  have delivered the code
		String str1=(String)lst.get(0);
		String str2=(String)lst.get(1);
		String str3=(String)lst.get(2);
		
		

	}

}
