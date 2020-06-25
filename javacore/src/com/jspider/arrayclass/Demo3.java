package com.jspider.arrayclass;

public class Demo3 {

	
	public static void main(String[] args) {
		System.out.println("program starts");
		Object[] obj=new Object[5];
		obj[0]="test";
		obj[1]=new A(24);
		obj[2]=new Demo2();
		obj[3]=new Demo3();
		obj[4]=12;
		for(Object obj1:obj)
		{
			System.out.println(obj1);
		}
		
		System.out.println("program ends");
	}

}
