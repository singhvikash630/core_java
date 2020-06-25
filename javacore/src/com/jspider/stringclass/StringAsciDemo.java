package com.jspider.stringclass;

public class StringAsciDemo {

	public static void main(String[] args)
	{
		byte ascii[]={92,66,67,68,69,70};
		String s1=new String(ascii);
		System.out.println(s1);
		String s2=new String(ascii,2,3);
		System.out.println("*********************");
		System.out.println("sum of"+"1"+5+6);
		System.out.println("sum of"+"1"+(5+6));
		System.out.println(1+5+'6');
		System.out.println(1+5+"6");
		System.out.println("*********************");
		
	}

}
