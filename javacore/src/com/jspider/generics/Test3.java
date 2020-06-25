package com.jspider.generics;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static double sum(List<? extends Number> list)
	{
		double sum=0;
		for(Number n:list)
		{
			sum+=n.doubleValue();
		}
		return sum;
	}
	public static void main(String[] args) {
		List ints=new ArrayList();
		ints.add(10.5);ints.add(14);
		double db=sum(ints);
		System.out.println(db);

	}

}
