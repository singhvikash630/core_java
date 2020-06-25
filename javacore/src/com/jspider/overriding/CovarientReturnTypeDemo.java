package com.jspider.overriding;
//covarient return type allowed from jdk1.5
class P{
	public Object test() {
		return null;
	}
}
public class CovarientReturnTypeDemo extends P{
	public String test() {
		return "vikash";

	}
	public static void main(String[] args) {
		CovarientReturnTypeDemo demo=new CovarientReturnTypeDemo();
		demo.test();
	}

}
