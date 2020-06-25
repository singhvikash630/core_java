package com.jspider.variable;
 class Xyz {
    public static String foo = "vikash";
}
 
  class Abc extends Xyz {	
		static {
	        foo = "bar";
	    }
  }

public class StaticNonstatic extends Xyz {

		
	public static void main(String[] args) {
				System.out.println(Xyz.foo);
		System.out.println(Abc.foo);

	}

}
