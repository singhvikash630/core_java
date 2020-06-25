package com.jspider.enummeration;

public enum Day
{
Monday,Tuesday,Wednesday,Thursday,Friday,Saterday,Sunday;
float f=3.14f;
public static void main(String[] args) 
{
	System.out.println("program starts");
	System.out.println(Day.class);
	System.out.println(Day.Friday);
	System.out.println(Day.values());
	System.out.println("program ends");		
	}
}
