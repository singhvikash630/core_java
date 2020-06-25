package java.jspider.typecasting1;
//practice purpose

class Demo7
{
	void test1() 
      {
		System.out.println("test1() method of Demo7");
	  }
}
class Demo4 extends Demo7
{
	void test2() 
      {
		System.out.println("test2() method of Demo4");
	  }
}
class Demo6 extends Demo4
{
	void test5() 
      {
		System.out.println("test5() method of Demo6");
	  }
}

class Demo5
{
	void test3(Demo7 d7) 
      {
		System.out.println("test3() method of Demo5");
		//d4.test2();
		d7.test1();
		test4((Demo6)d7);
		
		}
	  void test4(Demo6 d6) 
      {
		System.out.println("test4() method of Demo5");
		d6.test5();
		}
}
class Run2
{
	public static void main(String[] args) 
	{
		System.out.println("Program Starts");
		Demo5 d5=new Demo5();
		d5.test3(new Demo6());
		d5.test4(new Demo6());
        System.out.println("Program Ends");
	}
}
