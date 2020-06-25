package java.jspider.typecasting1;
//Derived Typecasting,auto upcasting & Explicit Downcasting
abstract interface IDemo6
{
	int i=10;
	static int j=20;
	public void test1();
   abstract int test2();
}
abstract class A implements IDemo6
{
	public void test1()
	{
	System.out.println("test1() method of class A");
	}
public int test2()
	{
	System.out.println("test2() method of class A");
	return 0;
	}
}
class B extends A
{
	public void test3()
	{
	System.out.println("test3() method of class B");
	}
}
class c extends B
{
	public void test4()
	{
	System.out.println("test4() method of class B");
	}
}

class Run
{
public static void main(String[] args)
	{
	System.out.println("*********One level upcasting************");
	B b1=new c();
	b1.test1();
	b1.test2();
	b1.test3();
	//b1.test4();//can't access
	System.out.println("*********second level upcasting************");
	A a1=(A)b1;
	a1.test1();
	a1.test2();
	//a1.test3();//can't access
	//a1.test4();//can't access
	System.out.println("********third level upcasting************");
	IDemo6 d6=a1;
	d6.test1();
	d6.test2();
	//d6.test3();//can't access
	//d6.test4();//can't access
	System.out.println("********one level downcasting************");
	A c1=(A)d6;
	c1.test1();
	c1.test2();
	//c1.test3();//can't access
	//c1.test4();//can't access
	System.out.println("********second level downcasting************");
	B c2=(B)d6;
	c2.test1();
	c2.test2();
	c2.test3();
	//c2.test4();//can't access
	System.out.println("Program Ends");
	B c3=new A();
	
	
	
	
}
}

