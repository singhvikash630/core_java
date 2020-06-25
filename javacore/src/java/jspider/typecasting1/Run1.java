package java.jspider.typecasting1;
//practice purpose
class Demo7
{
	void test1() 
      {
		System.out.println("test1() method of Demo3");
	  }
}
class Demo4
{
	void test2() 
      {
		System.out.println("test2() method of Demo3");
	  }
}
class Demo6
{
	  void test5() 
      {
		System.out.println("test2() method of Demo3");
	  }
}
class Demo5
{
	void test3(Demo7 d7,Demo4 d4,Demo6 d6) 
      {
		System.out.println("test3() method of Demo4");
		d7.test1();
		d4.test2();
		d6.test5();
		test4(d7);
		}
	  void test4(Demo7 d7) 
      {
		System.out.println("test4() method of Demo4");
		d7.test1();
	  }
}
class Run1
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo5 d4=new Demo5();
		d4.test3(new Demo7(),new Demo4(),new Demo6());
		d4.test4(new Demo7());
        System.out.println("Program Ends");
	}
}
