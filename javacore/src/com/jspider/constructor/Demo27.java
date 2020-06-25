package com.jspider.constructor;
/*

Constructor 

class Demo27
{
	int i;
Demo27()
{
 System.out.println("Running Constructor of class Demo27");
}  
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo27 d27=new Demo27();
		 System.out.println("i="+d27.i);
	    System.out.println("Program Ends");
	   
	}
}
*****************************************************************//*
class Demo27
{
	int i;
    Demo27()
     {
     System.out.println("Running Constructor of class Demo27");
      } 
	  static
	  {
     System.out.println("Running static of class Demo27");
      }
	  {
     System.out.println("Running non-static of class Demo27");
      }
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo27 d27=new Demo27();
		System.out.println("*********************************");
		Demo27 d28=new Demo27();
        System.out.println("i="+d27.i);
	    System.out.println("Program Ends");
	   
	}
}
***********************************************************************//*
class Demo27
{
	static int i;
    Demo27()
     {
     System.out.println("Running Constructor of class Demo27");
	 i=10;
      } 
	  static
	  {
     System.out.println("Running static of class Demo27");
	 int i=30;
      }
	  {
     System.out.println("Running non-static of class Demo27");
	 i=40;
      }
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo27 d27=new Demo27();
		System.out.println("i="+d27.i);

		System.out.println("*********************************");
		Demo27 d28=new Demo27();
        System.out.println("i="+d28.i);
	    System.out.println("Program Ends");
	   
	}
}
***********************************************************/


 class Demo27
{
	static int i;
    Demo27(int a)
     {
     System.out.println("Running Constructor of class Demo27");
	 i=a;
      } 
	  static
	  {
     System.out.println("Running static of class Demo27");
	 int i=30;
      }
	  {
     System.out.println("Running non-static of class Demo27");
	 i=40;
      }
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo27 d27=new Demo27(10);
		System.out.println("i="+d27.i);

		System.out.println("*********************************");
		Demo27 d28=new Demo27(20);
        System.out.println("i="+d28.i);
	    System.out.println("Program Ends");
	   
	}
}

/*class Demo27
{

Demo27()
{
 System.out.println("Running Constructor of class Demo27");
} 
void view()
	{
    System.out.println("Running Method of class Demo27");
}
public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		new Demo27().view();
		 System.out.println("Program Ends");
	   
	}
}*/



