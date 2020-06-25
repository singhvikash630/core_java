package com.jspider.stringclass;

public class StringBufferDemo1 {

	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("java");
		StringBuilder sc=new StringBuilder("java");
		
		System.out.println(sb);
		System.out.println("Length"+sb.length());
		System.out.println("capacity"+sb.capacity());
		System.out.println("**********************");
		StringBuffer s1=new StringBuffer("I Java");
		s1.insert(1,"like");
		s1.insert(2,3);
		s1.append(12.3);
		s1.append('c');
		s1.capacity();
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		
		
	}

}
