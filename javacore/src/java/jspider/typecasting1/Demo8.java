package java.jspider.typecasting1;
//passing reference variable without inheritance using four classes
class Demo7
{
	void test1(int i) 
      {
		System.out.println("test1() method of Demo3");
		System.out.println("i="+i);
      }
}
class Demo4
{
	void test2() 
      {
		System.out.println("test2() method of Demo3");
		}
}
class Demo5
{
	void test3(Demo7 d7) 
      {
		System.out.println("test3() method of Demo4");
		d7.test1(12);
      }
	  void test4(Demo4 d4) 
      {
		System.out.println("test4() method of Demo4");
		d4.test2();
      }
}
class Run
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo5 d4=new Demo5();
		d4.test3(new Demo7());
		d4.test4(new Demo4());
        System.out.println("Program Ends");
	}
}
