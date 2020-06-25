package java.jspider.typecasting1;
//passing reference variable without inheritance using four classes
class Demo9
{
	void test1() 
        {
		System.out.println("test1() method of Demo3");
		}
}
class Demo10 extends Demo9
{
	void test2() 
      {
		System.out.println("test2() method of Demo3");
	  }
}
class Demo11
{
	void test3(Demo9 d9) 
      {
		System.out.println("test3() method of Demo4");
		d9.test1();
		test4((Demo10)d9);
      }
	  void test4(Demo10 d10) 
      {
		System.out.println("test4() method of Demo4");
		d10.test2();
      }
}
class Run
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo11 d11=new Demo11();
		Demo10 d10=new Demo10();
		d11.test3(d10);
		d11.test4(d10);
        System.out.println("Program Ends");
	}
}
