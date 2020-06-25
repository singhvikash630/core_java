package com.jspider.arrayclass;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		System.out.println("program starts");
		int[] x=new int[5];//array declaration & initializatio should be in same line
		//x={1,2,3,4,5};
		//int[] x={10,20,50,30,60};		
		//x[0]=20;x[1]=10;x[2]=30;x[3]=40;x[4]=50;
		//x[0]=2;x[1]=1;x[2]=3;x[3]=4;x[4]=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no");
		x[0]=sc.nextInt();
		System.out.println("enter 2nd no");
		x[1]=sc.nextInt();
		System.out.println("enter 3rd no");
		x[2]=sc.nextInt();
		System.out.println("enter 4th no");
		x[3]=sc.nextInt();
		System.out.println("enter fifth no");
		x[4]=sc.nextInt();		
		System.out.println(x);
		System.out.println(x.length);
		for(int i=0;i<5;i++)
		{
			System.out.println(i+"element"+x[i]);
		}
		for(int y:x)
		{
			System.out.println(y);
		}
		Arrays.sort(x);
		System.out.println("*************************");
		for(int y:x)
		{
			System.out.println(y);
		}
		String s="hello";
		String s1="hello";
		System.out.println(s==s1);
		System.out.println("hello"+1+2);
		
		System.out.println("program ends");
		
	}

}
