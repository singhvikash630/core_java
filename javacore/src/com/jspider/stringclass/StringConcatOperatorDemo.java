package com.jspider.stringclass;

public class StringConcatOperatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="vikash";
		String s2="vikashkumar";		
		String s3=s1+"kumar";//Occured at run time
		String s4="vikash"+"kumar";//s2 and s4 both are same occureed at compile time
		
		System.out.println(s2==s3);//false
		System.out.println(s2==s4);//true

		final String s5="vikash";
		String s6=s5+"kumar";//occurred at compile time
		System.out.println(s2==s6);//true
	}

}
