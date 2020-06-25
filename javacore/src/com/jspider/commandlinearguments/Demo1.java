package com.jspider.commandlinearguments;

public class Demo1
{
	public static void main()
	{
		System.out.println("overloaded main method");
	}

	public static void main(String[] args)
	{
		System.out.println("program starts");
		//String[] s1={"data1","data2","data3"};
		System.out.println("total args:"+args.length);
		for(String arg:args)
		{
			System.out.println("arguments:"+arg);
		}
		Demo1.main();
		System.out.println("program ends");
		
	}

}
