
//reading the data from input device

package com.jspider.accesswr;
import java.util.Scanner;
public class Demo2
   {
    public static void main(String[] args) 
     {
    	System.out.println("Program Starts");
    	Scanner sckb=new Scanner(System.in);//scanner class doesn't contain default constructor
    	System.out.println("Enter the name");
    	String name=sckb.next();//reading the data from input device & storing in string variable
    	System.out.println("Your name is "+name);
    	System.out.println("Enter the age");
    	int age=sckb.nextInt();
    	if(age<1 || age>100)
    		System.out.println("Enter the age between 1 & 100");
    	else
    		System.out.println("your age is "+age);
    	
    	System.out.println("Program Ends");
		}
}
