
//passing reference variable without inheritance using four classes

package java.jspider.typecasting1;
class Demo9
{
	void test1() 
        {
		System.out.println("test1() method of Demo9");
		}
}
class Demo10 extends Demo9
{
	void test1() 
      {
		System.out.println("test2() method of Demo10");
	  }
}
class Demo11 extends Demo10
{
	void test1() 
      {
		System.out.println("test3() method of Demo11");
		}
}
class Run
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo11 d11=new Demo11();
	    d11.test1();
		System.out.println("*********************");
		Demo10 d10=new Demo11();
		d10.test1();
		System.out.println("*********************");
		Demo9 d9=new Demo11();
		d9.test1();
        System.out.println("Program Ends");
	}
}
