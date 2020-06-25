package com.jspider.inheritance;

class Xyz 
{
	public  String foo = "vikash";
}

class Abc extends Xyz {	
	{
		foo = "bar";
	}
}

public class Demo6 extends Xyz {	

	public static void main(String[] args) {
		Abc a1=new Abc();

		System.out.println(a1.foo);
	}

}
