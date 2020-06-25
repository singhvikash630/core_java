package com.jspider.jdk9;

interface PrivateMethosInInterfaceDemo {
	
	/*
	 * public,abstract and non static by default for method 
	 * public,static,final variable bydefault upto 1.7
	 */
	public abstract void m1();
	public static final int x=10;
	
	/*
	 * default method and static method() came in 1.8
	 */
	
	default void m2() {
		m4();
	}

	static void m3() {
		
	}
	
	/*
	 * private method  came in 1.9
	 */
	
	private void m4() {

	}
	
}
