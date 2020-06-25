package java.jspider.typecasting1;
//passing reference variable without inheritance
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
	void test2(Demo7 d7) 
      {
		System.out.println("test2() method of Demo3");
		//Demo7 d7=new Demo7();
		d7.test1(12);
      }
}
class Run
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo4 d4=new Demo4();
		d4.test2(new Demo7());
        System.out.println("Program Ends");
	}
}
