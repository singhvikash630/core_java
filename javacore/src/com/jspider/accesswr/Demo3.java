
//program for big no

package com.jspider.accesswr;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args)
	{
		System.out.println("Program Starts");
		System.out.println("Enter the First Number");
		Scanner sc=new Scanner(System.in);
		int no1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int no2=sc.nextInt();
		if(no1>no2)
			System.out.println("big number is"+no1);
		else
			System.out.println("big no is"+no2);
		System.out.println("Program Ends");
	}

}
