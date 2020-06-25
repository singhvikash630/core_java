package com.jspider.main;

 class Demo 
 {
	 public static void main()
	 {
		 System.out.println("overloaded main method");
	 }
	public static void main(String[] args)
	{
		System.out.println("program starts");
		System.out.println("total arguments passed"+args.length);
		for(String s1:args)
		{
			System.out.println(s1);
		}
		System.out.println("program ends");
		}}
class Demo6
{
public static void main(String[] args)
{
	System.out.println("program starts");
	String[] arr={"data1","data2","data3"};
	Demo.main(arr);
	Demo.main();
	System.out.println("program ends");
	
}	
}