package com.jspider.exception;

public class Demo5 {

	
	public static void main(String[] args) throws ClassNotFoundException
	{
		System.out.println("program starts");
		Class.forName("Demo5");//checked exception
		/*try {
			Class.forName("Demo4");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//int j=1/0;//unchecked exception
		System.out.println("program ends");
			}

}
